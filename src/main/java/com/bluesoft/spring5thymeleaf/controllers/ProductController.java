package com.bluesoft.spring5thymeleaf.controllers;

import com.bluesoft.spring5thymeleaf.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class ProductController {

    private final ProductService productService;

    ProductController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    String getProduct(){
        return "redirect:/";
    }

    @GetMapping("/product/{id}")
    String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product",productService.getProduct(id));

        return "product";
    }
}
