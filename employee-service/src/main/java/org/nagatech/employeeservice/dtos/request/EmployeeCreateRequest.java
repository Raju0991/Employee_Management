package org.nagatech.employeeservice.dtos.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.nagatech.employeeservice.enums.Gender;

import java.time.LocalDate;

@Data
public class EmployeeCreateRequest {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Size(min =8, message = "Password must be at least 8 characters long")
    private String password;
    @Pattern(regexp = "^[0-9]{10}$")
    private String mobileNumber;
    @NotNull
    private Gender gender;
    @NotNull
    private LocalDate dateOfBirth;
    @NotNull
    private LocalDate dateOfJoining;
    @NotNull
    private Long dept_id;
    @NotNull
    private Long designation_id;
    @NotNull
    private Long manager_id;
    @Valid
    @NotNull
    private AddressRequest addressRequest;
}
