package org.nagatech.userservice.service;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.exception.UserNotFundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserResponse createUser(UserRequest request);
    List<UserResponse> getAllUsers();
    UserResponse updateUser(UserRequest request, Long id) throws Exception;
    void deleteUser(Long id) throws UserNotFundException, Exception;;
}
