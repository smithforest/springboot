package com.hs.dptingboot_01_04_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getId(){
        System.out.println("maven空项目搭建springboot");
        return "maven空项目搭建springboot";
    }
}
