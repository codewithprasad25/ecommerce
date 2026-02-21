package com.example.ProductListing.service;

import com.example.ProductListing.model.ProductEntity;
import org.springframework.data.domain.Page;

public interface ProductService {

    ProductEntity create(ProductEntity product);

    ProductEntity findById(Long productId);

    Page<ProductEntity> findAll(int pageNumber, int pageSize);

    ProductEntity update(Long productId, ProductEntity updatedProduct);

    void deleteById(Long productId);
}