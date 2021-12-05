package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.Reaction;
import com.example.reactiveneo4j.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reaction")
public class ReactionController {

    @Autowired
    private ReactionService reactionService;

    @PostMapping(value="/create")
    public Mono<Reaction> create(@RequestBody Reaction reaction){
        return reactionService.create(reaction);

    }
    @GetMapping("/getAll")
    public Flux<Reaction> getAll(){
        return reactionService.getAll();
    }
}
