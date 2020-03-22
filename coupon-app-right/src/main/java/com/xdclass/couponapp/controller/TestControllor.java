package com.xdclass.couponapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Claire
 * @date  2020/3/22 上午10:31
 *
 */
@RestController
public class TestControllor {

    @RequestMapping("/test")
    public String test(){
        return "111";
    }
}
