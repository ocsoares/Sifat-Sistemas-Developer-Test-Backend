package com.ocsoares.sifat_sistemas_developer_test.services;

import com.ocsoares.sifat_sistemas_developer_test.entities.GroupEntity;
import com.ocsoares.sifat_sistemas_developer_test.repositories.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public List<GroupEntity> findAll(Sort sort) {
        return groupRepository.findAll(sort);
    }
}