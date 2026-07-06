package org.nagatech.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="addresses")
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long address_id;
    private String addressLine1;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}
