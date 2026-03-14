package com.ocsoares.sifat_sistemas_developer_test.controllers;

import com.ocsoares.sifat_sistemas_developer_test.entities.ProductEntity;
import com.ocsoares.sifat_sistemas_developer_test.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // GET /api/products            → totalSold ASC (padrão)
    // GET /api/products?order=DESC → totalSold DESC
    // GET /api/products?order=ASC  → totalSold ASC
    @GetMapping
    public ResponseEntity<List<ProductEntity>> findAll(
            @RequestParam(defaultValue = "ASC") String direction
    ) {
        if (!direction.equalsIgnoreCase("ASC") && !direction.equalsIgnoreCase("DESC")) {
            return ResponseEntity.badRequest().build();
        }

        Sort sort = Sort.by(Sort.Direction.fromString(direction), "totalSold");
        return ResponseEntity.ok(productService.findAll(sort));
    }
}