package com.example.reactiveneo4j.controller;

import com.example.reactiveneo4j.model.User;
import com.example.reactiveneo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/create")
    public Mono<User> create(@RequestBody User user)
    {
         return userService.create(user);
    }
    @GetMapping("/getAll")
    public Flux<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("getByUserId/{userId}")
    public Mono<User> getByUserId(@PathVariable(value="userId")String userId){
        return userService.getByUserId(userId);
    }
    @GetMapping("/getByName/{name}")
    public Mono<User> getByName(@PathVariable(value="name")String name){
        return userService.getByName(name);
    }
    @PutMapping("/update/{UserId}")
    public Mono<User> update(@RequestBody User user,@PathVariable(value="UserId")String userId){
        return userService.update(user,userId);
    }
    @DeleteMapping("/delete")
    public void deleteAll(){
        userService.deleteAll();
        System.out.println("Delete please");
    }
    @DeleteMapping("/deleteById/{userId}")
    public Mono<Void> deleteByUserId(@PathVariable(value="userId")String userId){
        System.out.println("Delete Done");
        return userService.deleteByUserId(userId);
    }

}
