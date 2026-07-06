package org.nagatech.userservice.controller;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(request));
    }
}
