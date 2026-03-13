package com.ocsoares.sifat_sistemas_developer_test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cmv")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CmvEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String month;

    @Column(nullable = false)
    private BigDecimal cost;
}
