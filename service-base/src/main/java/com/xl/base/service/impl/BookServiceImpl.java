package com.xl.base.service.impl;

import com.xl.base.dao.BookDAO;
import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

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
}
