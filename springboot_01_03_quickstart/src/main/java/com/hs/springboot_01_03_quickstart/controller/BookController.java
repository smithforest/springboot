package com.hs.springboot_01_03_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getId(){
        System.out.println("IDEA从阿里云搭建springboot项目");
        return "IDEA从阿里云搭建springboot项目";
    }
}
