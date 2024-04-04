package org.example.crudspringredis.service;

import org.example.crudspringredis.model.Product;
import org.example.crudspringredis.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(String id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}