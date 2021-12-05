package com.example.reactiveneo4j.service;

import com.example.reactiveneo4j.model.User;
import com.example.reactiveneo4j.repo.UserRepository;
//import org.neo4j.driver.internal.shaded.reactor.core.publisher.Flux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.Optional;


@Service
public class UserService {

    @Autowired(required = true)
    private UserRepository userRepository;


    public Mono<User> create(User user)
    {
        Date date=new Date();
        user.setLastSeenTimeStamp(date);
        return userRepository.save(user);
    }

    public Flux<User> getAll() {
        return userRepository.findAll();
    }

    public Mono<User> getByUserId(String userId) {
        return userRepository.findById(userId);
    }

    public Mono<User> getByName(String name) {
        return userRepository.getByName(name);
    }

    public Mono<User> update(User user, String userId) {
        return userRepository.findById(userId)
                .flatMap(u ->{u.setName(user.getName());
                               u.setAge(user.getAge());
                return userRepository.save(u);
                });
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public Mono<Void> deleteByUserId(String userId){
        return userRepository.deleteById(userId);

    }
}
