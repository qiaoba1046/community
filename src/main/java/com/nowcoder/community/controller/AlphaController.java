package com.nowcoder.community.controller;

import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Le
 * @Data 2022/7/18 11:29
 */
@RestController
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Spring Boot.";
    }

    @GetMapping("/data")
    public String getData(){
        return alphaService.find();
    }
}
