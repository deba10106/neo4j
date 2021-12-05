package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.Share;
import com.example.reactiveneo4j.repo.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShareService {

    @Autowired(required = true)
    private ShareRepository shareRepository;

    public Mono<Share> create(Share share) {
        return shareRepository.save(share);
    }

    public Flux<Share> getAll() {
        return shareRepository.findAll();
    }
}
