package com.wex.test.laercio.demo.controller;
import com.wex.test.laercio.demo.model.User;
import com.wex.test.laercio.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getById(@PathVariable int id) {
        return userService.findById(id);
    }
}
