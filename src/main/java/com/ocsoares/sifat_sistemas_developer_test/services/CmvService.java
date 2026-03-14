package com.ocsoares.sifat_sistemas_developer_test.services;

import com.ocsoares.sifat_sistemas_developer_test.entities.CmvEntity;
import com.ocsoares.sifat_sistemas_developer_test.repositories.CmvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CmvService {

    private final CmvRepository cmvRepository;

    public List<CmvEntity> findAll() {
        return this.cmvRepository.findAll();
    }
}
