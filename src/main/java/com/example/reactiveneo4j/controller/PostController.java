package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.Post;
import com.example.reactiveneo4j.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping(value = "/create")
    public Mono<Post> create(@RequestBody Post post){
        return postService.create(post);
    }
    @GetMapping(value="/getAll")
    public Flux<Post> getAll(){
        return postService.getAll();
    }

//    @GetMapping("/getByPostId/{postId}")
//    public Mono<Post> getByPostId(@PathVariable(value="postId")String postId){
//        return postService.getByPostId(postId);
//    }
//    @GetMapping(value="/getByUserId/{userId}")
//    public Mono<Post> getByUserId(@PathVariable(value="userId")String userId){
//        return postService.getByUserId(userId);
//    }
//    @GetMapping(value="/getByImg_src/{img_src}")
//    public Mono<Post> getByImg_src(@PathVariable(value="img_src")String img_src){
//        return postService.getByImg_src(img_src);
//    }
//    @PutMapping("/update/{id}")
//    public Mono<Post> update(@RequestBody Post post, @PathVariable(value="id")String id){
//        return postService.update(post,id);
//    }
//    @DeleteMapping("/deleteAll")
//    public void deleteAll(){
//        postService.deleteAll();
//    }
//
//    @DeleteMapping("/deleteById/{id}")
//    public Mono<Void> deleteById(@PathVariable(value="id")String id){
//       return postService.deleteById(id);
//    }
}
