package com.example.ProductListing.service.impl;

import com.example.ProductListing.model.Product;
import com.example.ProductListing.repository.ProductRepository;
import com.example.ProductListing.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() ->
                        new RuntimeException("Product not found with id: " + productId)
                );
    }

    @Override
    public Page<Product> findAll(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        return productRepository.findAll(pageRequest);
    }

    @Override
    public Product update(Long productId, Product updatedProduct) {

        Product existingProduct = findById(productId);

        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setModifiedBy(updatedProduct.getModifiedBy());

        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteById(Long productId) {

        if (!productRepository.existsById(productId)) {
            throw new RuntimeException("Product not found with id: " + productId);
        }

        productRepository.deleteById(productId);
    }
}