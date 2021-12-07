package com.missloverexception.concurrency.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @RequestMapping("startTest")
    public String startTest() {
        Logger logger = LoggerFactory.getLogger(TestController.class);
        logger.info("request success!");
        return "success";
    }

}
