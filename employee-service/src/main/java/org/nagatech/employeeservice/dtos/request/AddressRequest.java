package org.nagatech.employeeservice.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
    @NotBlank(message = "Address Line1 is required")
    private String address_line1;
    @NotBlank(message = "city is required")
    private String city;
    @NotBlank(message = "state is required")
    private String state;
    @NotBlank(message = "country is required")
    private String country;
    @Pattern(regexp = "\\d{6}", message = "PinCode is required and must be 6 dists")
    private String pinCode;
}
