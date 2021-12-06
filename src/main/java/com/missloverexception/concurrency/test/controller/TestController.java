package com.missloverexception.concurrency.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("startTest")
    public String startTest() {
        return "success";
    }
}
