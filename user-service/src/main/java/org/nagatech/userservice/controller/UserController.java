package org.nagatech.userservice.controller;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(request));
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        List<UserResponse> allUsers=userService.getAllUsers();

        return ResponseEntity.status(HttpStatus.OK).body(allUsers);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<UserResponse> updateUser(
            @PathVariable Long id, @RequestBody UserRequest request) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(request,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) throws Exception {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
