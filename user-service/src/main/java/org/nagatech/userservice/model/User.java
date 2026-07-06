package org.nagatech.userservice.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.nagatech.userservice.enums.Role;

import java.time.LocalDateTime;
@Data
@Builder
@Entity
@Table(name="users_001")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    private String mobile;
    private Role role;
    private boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
