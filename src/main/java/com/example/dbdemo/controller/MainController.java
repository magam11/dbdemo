package com.example.dbdemo.controller;

import com.example.dbdemo.service.ProductService;
import com.example.dbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {


    private UserService userService;
    private ProductService productService;

    @Autowired
    public MainController(UserService userService, ProductService productService){
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        Map<String, Object> response = new HashMap<>();
        response.put("users", userService.getAllUsers());
        response.put("products",productService.getAllProducts());
        return ResponseEntity.ok(response);
    }
}
