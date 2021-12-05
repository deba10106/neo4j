package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.Comment;
import com.example.reactiveneo4j.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CommentService {

    @Autowired(required = true)
    private CommentRepository commentRepository;

    public Mono<Comment> create(Comment comment) {
        return commentRepository.save(comment);
    }

    public Flux<Comment> getAll() {
        return commentRepository.findAll();
    }
}
