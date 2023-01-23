package com.devdelivery.rfcommerce.repositories;

import com.devdelivery.rfcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
