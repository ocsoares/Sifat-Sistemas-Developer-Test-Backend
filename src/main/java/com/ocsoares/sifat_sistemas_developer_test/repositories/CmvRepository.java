package com.ocsoares.sifat_sistemas_developer_test.repositories;

import com.ocsoares.sifat_sistemas_developer_test.entities.CmvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CmvRepository extends JpaRepository<CmvEntity, UUID> {
}
