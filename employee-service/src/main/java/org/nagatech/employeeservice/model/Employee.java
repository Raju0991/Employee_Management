package org.nagatech.employeeservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.nagatech.employeeservice.enums.EmployeeStatus;
import org.nagatech.employeeservice.enums.Gender;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long emp_id;

    @Column(nullable = false, unique = true)
    private String empCode;
    @Column(nullable = false)
    private String firstName;

    private String lastName;
    @Email
    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @Column(nullable = false, unique = true)
    private String mobileNo;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dept_id")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="designation_id")
    private Designation designation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id")
    private Role role;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="manager_id")
    private Employee manager;


}
