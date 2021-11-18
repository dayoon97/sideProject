package com.example.sideproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/vue")
    public String home() {
        return "vue/index";
    }
}
