package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lb")
public class UserController {
    @RequestMapping("/ll")
    public String liubi(String ss) {
        System.out.println("传入的数据为：" + ss);
        return "传入的数据为：" + ss;

    }
}
