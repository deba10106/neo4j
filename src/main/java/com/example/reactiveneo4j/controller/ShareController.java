package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.Share;
import com.example.reactiveneo4j.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/share")
public class ShareController {


    @Autowired
    private ShareService shareService;

    @PostMapping("/create")
    public Mono<Share> create(@RequestBody Share share){
        return shareService.create(share);
    }
    @GetMapping(value="/getAll")
    public Flux<Share> getAll(){
        return shareService.getAll();
    }
}
