package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.Reaction;
import com.example.reactiveneo4j.repo.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactionService {

    @Autowired(required = true)
    private ReactionRepository reactionRepository;


    public Mono<Reaction> create(Reaction reaction) {
        return reactionRepository.save(reaction);
    }

    public Flux<Reaction> getAll() {
        return reactionRepository.findAll();
    }
}
