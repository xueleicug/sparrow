package com.xl.base.controller;

import com.xl.base.entity.Book;
import com.xl.base.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private String port;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/hello")
    public String index() throws InterruptedException {

        int sleepTime = new Random().nextInt(2000);
        System.out.println(sleepTime);
        Thread.sleep(sleepTime);
        String res = String.format("Hello Spring Boot from %s:%s", serviceName, port);
        return res;
    }

    @RequestMapping(value = "/book/all", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/book/press", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<String> getAllPress() {
        return bookService.getAllPress();
    }

    @RequestMapping(value = "/book/all/desc", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<Book> getAlldesc() {
        return bookService.getAllBookOrderByBuytimeDesc();
    }
}
