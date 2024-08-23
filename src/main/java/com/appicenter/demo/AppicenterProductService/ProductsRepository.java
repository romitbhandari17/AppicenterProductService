package com.appicenter.demo.AppicenterProductService;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

    List<Products> findByCategory(String category);
}
