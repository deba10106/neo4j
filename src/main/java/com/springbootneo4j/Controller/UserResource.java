package com.springbootneo4j.Controller;

import com.springbootneo4j.service.UserService;
import com.springbootneo4j.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/neo4j")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/USER/getAll")
    public Collection<User> getAll() {
        return userService.getAll();
    }

}
