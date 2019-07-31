package com.example.dbdemo.service;

import com.example.dbdemo.secondDbEntity.Product;
import com.example.dbdemo.secondDbRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    private ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
