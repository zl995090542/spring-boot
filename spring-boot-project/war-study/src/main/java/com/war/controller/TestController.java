package com.war.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zenglong
 * @date at 2022/3/8
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String getName(){
        return "?????";
    }
}
