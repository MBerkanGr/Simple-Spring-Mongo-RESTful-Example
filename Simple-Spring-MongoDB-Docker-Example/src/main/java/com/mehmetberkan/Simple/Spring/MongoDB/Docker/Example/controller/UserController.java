package com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.controller;

import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.request.CreateUserRequest;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.model.User;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Boolean> addUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(userService.addUser(request));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }
}
