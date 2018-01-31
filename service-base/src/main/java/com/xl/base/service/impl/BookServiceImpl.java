package com.xl.base.service.impl;

import com.xl.base.dao.BookDAO;
import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import com.xl.framework.cache.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private RedisCache redisCache;

    @Override
    public List<Book> getAllBooks() {

        return bookDAO.findAll();
    }

    @Override
    public List<String> getAllPress() {
        return bookDAO.findPressDistinct();
    }

    @Override
    public List<Book> getAllBookOrderByBuytimeDesc() {

        return bookDAO.findAllByOrderByBuytimeDesc();
    }

    @Override
    public Book getBookByName(String name) {
        return bookDAO.findByName(name);
    }

    @Override
    @Transactional
    public void deleteBookByName(String name) {
        bookDAO.deleteBookByName(name);
    }

    @Override
    @Transactional
    public void insertBook(Book book) {
        bookDAO.save(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDAO.save(book);
    }
}
