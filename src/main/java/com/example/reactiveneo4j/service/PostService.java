package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.Post;
import com.example.reactiveneo4j.model.User;
import com.example.reactiveneo4j.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired()
    private PostRepository repo;

    public Mono<Post> create(Post post) {
//        Date date = new Date();
//        post.setTimeStamp(date);
        return repo.save(post);
    }

//    public Mono<Post> getByPostId(String postId) {
//        return repo.findById(postId);
//    }
//
//    public Mono<Post> getByUserId(String userId) {
//        return repo.findById(userId);
//    }

    public Flux<Post> getAll() {
        return repo.findAll();
    }
//    public Mono<Post> getByImg_src(String img_src) {
//        return repo.getByImg_src(img_src);
//    }
//
//    public Mono<Post> update(Post post, String id) {
//        return repo.findById(id)
//                .flatMap(p ->{
//                    p.setImg_src(post.getImg_src());
//                    return repo.save(p);
//                });
//    }
//
//    public void deleteAll() {
//        repo.deleteAll();
//    }
//
//    public Mono<Void> deleteById(String id) {
//        return repo.deleteById(id);
//    }

}
