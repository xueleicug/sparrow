package com.xl.base.controller;

import com.alibaba.fastjson.JSON;
import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookByName(@RequestParam String name) {

        Book book = bookService.getBookByName(name);
        return book;
    }

    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    public void deleteBookByName(@RequestParam String name) {
        bookService.deleteBookByName(name);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void updateBookByName(String bookInfo) {
        Book book = JSON.parseObject(bookInfo, Book.class);
        bookService.updateBook(book);
    }

    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    public void addBook(@RequestParam String bookInfo) {
        Book book = JSON.parseObject(bookInfo, Book.class);
        bookService.insertBook(book);
    }
}
