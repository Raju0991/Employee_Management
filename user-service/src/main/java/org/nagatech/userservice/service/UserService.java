package org.nagatech.userservice.service;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse createUser(UserRequest request);
}
