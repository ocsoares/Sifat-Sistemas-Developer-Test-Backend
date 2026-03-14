package com.ocsoares.sifat_sistemas_developer_test.services;

import com.ocsoares.sifat_sistemas_developer_test.entities.ProductEntity;
import com.ocsoares.sifat_sistemas_developer_test.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductEntity> findAll(Sort sort) {
        return productRepository.findAll(sort);
    }
}