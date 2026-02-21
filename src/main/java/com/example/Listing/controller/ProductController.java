package com.example.ProductListing.controller;

import com.example.ProductListing.model.ProductEntity;
import com.example.ProductListing.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/catalog/products")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductEntity> createProduct(@Valid @RequestBody ProductEntity request) {
        ProductEntity savedProduct = productService.createProduct(request);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductEntity> fetchProductById(@PathVariable Long productId) {
        ProductEntity product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public ResponseEntity<Page<ProductEntity>> fetchAllProducts(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize) {

        Page<ProductEntity> products = productService.getAllProducts(pageNumber, pageSize);
        return ResponseEntity.ok(products);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<ProductEntity> modifyProduct(
            @PathVariable Long productId,
            @Valid @RequestBody ProductEntity updatedRequest) {

        ProductEntity updatedProduct = productService.updateProduct(productId, updatedRequest);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> removeProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}