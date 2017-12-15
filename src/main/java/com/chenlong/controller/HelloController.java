package com.chenlong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PVer on 2017/12/13.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello() {
        return "Your first spring boot project has started !~";
    }
}
