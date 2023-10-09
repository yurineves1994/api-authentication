package com.auth.projectauth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.projectauth.entities.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
