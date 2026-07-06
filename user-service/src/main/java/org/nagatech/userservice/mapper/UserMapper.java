package org.nagatech.userservice.mapper;

import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.model.User;

public class UserMapper {

    public static User toEntity(UserRequest userRequest){
        return User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .mobile(userRequest.getMobile())
                .role(userRequest.getRole())
                .status(userRequest.isStatus())
                .createdAt(userRequest.getCreatedAt())
                .updatedAt(userRequest.getUpdatedAt()).build();
    }
 public static UserResponse toResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .mobile(user.getMobile())
                .role(user.getRole())
                .status(user.isStatus())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt()).build();
 }
}

