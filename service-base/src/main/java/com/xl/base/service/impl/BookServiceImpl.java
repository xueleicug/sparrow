package com.xl.base.service.impl;

import com.xl.base.dao.BookDAO;
import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import com.xl.framework.cache.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Object o = redisCache.get("kk");
        if (null == o) {
           redisCache.put("kk", "testKey");
        } else {
            log.debug("get kk" + o.toString());
        }
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
