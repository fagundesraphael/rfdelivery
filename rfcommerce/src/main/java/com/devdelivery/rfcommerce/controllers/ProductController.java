package com.devdelivery.rfcommerce.controllers;

import com.devdelivery.rfcommerce.dto.ProductDTO;
import com.devdelivery.rfcommerce.entities.Product;
import com.devdelivery.rfcommerce.repositories.ProductRepository;
import com.devdelivery.rfcommerce.sevices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return service.findById(id);

    }
}
