package org.nagatech.employeeservice.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long address_id;
    private String address_line1;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}

