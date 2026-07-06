package org.nagatech.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nagatech.userservice.enums.Role;
import org.nagatech.userservice.model.Address;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobile;
    private Role role;
    private boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private AddressResponse address;
}
