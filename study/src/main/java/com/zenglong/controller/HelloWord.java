package com.zenglong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zenglong
 * @date at 2021/7/12
 */
@Controller
public class HelloWord {
    @RequestMapping("boot-source")
    @ResponseBody
    public String getMessage(){
        return "ss";
    }
}
