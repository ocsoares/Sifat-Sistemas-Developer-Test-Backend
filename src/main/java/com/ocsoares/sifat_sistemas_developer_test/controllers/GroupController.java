package com.ocsoares.sifat_sistemas_developer_test.controllers;

import com.ocsoares.sifat_sistemas_developer_test.entities.GroupEntity;
import com.ocsoares.sifat_sistemas_developer_test.services.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    // GET /api/groups            → totalSold DESC (padrão)
    // GET /api/groups?order=ASC  → totalSold ASC
    // GET /api/groups?order=DESC → totalSold DESC
    @GetMapping
    public ResponseEntity<List<GroupEntity>> findAll(
            @RequestParam(defaultValue = "DESC") String order
    ) {
        if (!order.equalsIgnoreCase("ASC") && !order.equalsIgnoreCase("DESC")) {
            return ResponseEntity.badRequest().build();
        }

        Sort sort = Sort.by(Sort.Direction.fromString(order), "totalSold");
        return ResponseEntity.ok(groupService.findAll(sort));
    }
}