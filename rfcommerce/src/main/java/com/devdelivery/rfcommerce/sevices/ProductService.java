package com.devdelivery.rfcommerce.sevices;

import com.devdelivery.rfcommerce.dto.ProductDTO;
import com.devdelivery.rfcommerce.entities.Product;
import com.devdelivery.rfcommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
