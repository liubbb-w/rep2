package com.liu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/lb")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ll")
    public String liubi(String ss) {
        System.out.println("传入的值为：s" + ss);
        String forObject = restTemplate.getForObject("http://EUREKA-SERVICE/lb/ll?s=" + ss, String.class);
        return forObject;
    }

}
