package com.ocsoares.sifat_sistemas_developer_test.controllers;

import com.ocsoares.sifat_sistemas_developer_test.entities.CmvEntity;
import com.ocsoares.sifat_sistemas_developer_test.services.CmvService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cmv")
@RequiredArgsConstructor
public class CmvController {
    private final CmvService cmvService;

    @GetMapping()
    public List<CmvEntity> findAll() {
        return this.cmvService.findAll();
    }
}
