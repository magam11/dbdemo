package com.example.dbdemo.secondDbRepository;

import com.example.dbdemo.secondDbEntity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
}
