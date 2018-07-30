package com.xl.base.controller.com.xl.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBaseController {

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${spring.application.name}")
    private String port;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    public String index() {
        return this.serviceName;
    }
}
