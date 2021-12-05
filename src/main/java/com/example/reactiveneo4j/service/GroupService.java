package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.Group;
import com.example.reactiveneo4j.repo.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Mono<Group> create(Group group) {
        return groupRepository.save(group);
    }

    public Flux<Group> getAll() {
        return groupRepository.findAll();
    }
}
