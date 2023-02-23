package com.hs.dptingboot_01_04_quickstart.springboot_01_02_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getId(){
        System.out.println("从官网直接搭建springboot项目");
        return "从官网直接搭建springboot项目";
    }
}
