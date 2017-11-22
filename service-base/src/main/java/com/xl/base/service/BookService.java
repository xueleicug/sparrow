package com.xl.base.service;


import com.xl.base.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public List<String> getAllPress();

    public List<Book> getAllBookOrderByBuytimeDesc();
}
