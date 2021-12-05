package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.Comment;
import com.example.reactiveneo4j.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired(required = true)
    private CommentService commentService;

    @PostMapping(value="/create")
    public Mono<Comment> create(@RequestBody Comment comment){
        return commentService.create(comment);
    }
    @GetMapping(value="/getAll")
    public Flux<Comment> getAll(){
        return commentService.getAll();
    }
}
