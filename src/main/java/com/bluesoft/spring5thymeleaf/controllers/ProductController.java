package com.bluesoft.spring5thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ProductController {

    @GetMapping("/product")
    String getProduct(){
        return "product";
    }
}
