package com.xl.base.controller;

import com.alibaba.fastjson.JSON;
import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import com.xl.framework.utils.ObjectUtil;
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

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable Integer id) {
        Book book = bookService.getBookById(id);
        return book;
    }

    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    public void deleteBookByName(@RequestParam String name) {
        bookService.deleteBookByName(name);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void addBookByName(String bookInfo) {
        Book book = JSON.parseObject(bookInfo, Book.class);
        bookService.insertBook(book);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Integer id) {
        bookService.deleteBookById(id);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public void updateBook(@PathVariable String id, @RequestParam String bookInfo) {
        Book book = bookService.getBookById(Integer.parseInt(id));
        Book bookNew = JSON.parseObject(bookInfo, Book.class);
        if(book != null) {
            book = ObjectUtil.propertyUpdate(bookNew, book);
            bookService.updateBook(book);
        }
    }

    @RequestMapping(value = "/book/count/press", method = RequestMethod.GET)
    public Integer countBookByPress(@RequestParam String pressName) {
        Integer count = bookService.countBooksByPressName(pressName);
        return count;
    }
}
