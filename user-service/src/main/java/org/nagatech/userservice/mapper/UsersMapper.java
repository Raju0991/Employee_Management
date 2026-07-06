package org.nagatech.userservice.mapper;

import org.mapstruct.Mapper;
import org.nagatech.userservice.dto.UserRequest;
import org.nagatech.userservice.dto.UserResponse;
import org.nagatech.userservice.model.User;

@Mapper(componentModel = "spring", uses= AddressMapper.class)
public interface UsersMapper {
    User toEntity(UserRequest request);
    UserResponse toResponse(User user);
}
