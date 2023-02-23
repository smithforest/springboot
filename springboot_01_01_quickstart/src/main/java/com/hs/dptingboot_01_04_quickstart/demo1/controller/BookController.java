package com.hs.dptingboot_01_04_quickstart.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getId(){
        System.out.println("IDEA从官网搭建springboot项目");
        return "IDEA从官网搭建springboot项目";
    }
}
