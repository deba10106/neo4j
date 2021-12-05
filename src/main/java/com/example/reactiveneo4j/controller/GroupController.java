package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.Group;
import com.example.reactiveneo4j.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired(required = true)
    private GroupService groupService;

    @PostMapping(value = "/create")
    public Mono<Group> create(@RequestBody Group group){
        return groupService.create(group);
    }
    @GetMapping(value="/getAll")
    public Flux<Group> getAll(){
        return groupService.getAll();

    }
}
