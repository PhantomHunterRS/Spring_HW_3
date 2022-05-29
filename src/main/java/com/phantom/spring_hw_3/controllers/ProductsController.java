package com.phantom.spring_hw_3.controllers;

import com.phantom.spring_hw_3.Product;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductsController {

    @GetMapping(value = "/product/{id}",produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public Product productId(@PathVariable (name = "id") Long identy){
        return new Product(1L,"Banana",200);
    }
}
