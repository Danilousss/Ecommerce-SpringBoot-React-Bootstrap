package com.ecom.productcatolog.service;

import com.ecom.productcatolog.model.Product;
import com.ecom.productcatolog.repository.ProductRepository;
import org.apache.tomcat.jni.Pool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCategory(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }
}
