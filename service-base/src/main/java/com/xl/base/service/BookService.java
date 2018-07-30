package com.xl.base.service;


import com.xl.base.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public List<String> getAllPress();

    public List<Book> getAllBookOrderByBuytimeDesc();

    public Book getBookByName(String name);

    public Book getBookById(Integer id);

    public void deleteBookByName(String name);

    public void deleteBookById(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);

    public Integer countBooksByPressName(String pressName);

}
