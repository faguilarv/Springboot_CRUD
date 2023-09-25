package com.faguilar.mycrud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class TestController {
    @GetMapping("check")
    public String check(){

        return "MyCRUD";
    }
}
