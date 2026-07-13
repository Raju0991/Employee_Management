package org.nagatech.employeeservice.service;

import org.nagatech.employeeservice.dtos.request.ChangePasswordRequest;
import org.nagatech.employeeservice.dtos.request.EmployeeCreateRequest;
import org.nagatech.employeeservice.dtos.response.EmployeeResponse;
import org.nagatech.employeeservice.enums.EmployeeStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    //cured operations
    EmployeeResponse createEmployee(EmployeeCreateRequest request);
    EmployeeResponse updateEmployee(Long emp_id,EmployeeCreateRequest request);
    void deleteEmployee(Long emp_id);
    EmployeeResponse findEmployeeById(Long emp_id);
    List<EmployeeResponse> findAllEmployees();

    //Pagination and sorting
    Page<EmployeeResponse> findAllEmployees(Pageable pageable);

    // search
    EmployeeResponse getEmployeeByEmployeeCode(String empCode);
    EmployeeResponse getEmployeeByEmail(String email);
    EmployeeResponse getEmployeeByMobileNumber(String mobileNumber);
    List<EmployeeResponse> getEmployeesByFirstName(String firstName);
    List<EmployeeResponse> getEmployeesByLastName(String lastName);
    List<EmployeeResponse> searchEmployees(String keyword);

    //Relationship Queries
    List<EmployeeResponse> getEmployeesByDepartmentId(Long dept_id);
    List<EmployeeResponse> getEmployeesByDesignation(Long designation_id);
    List<EmployeeResponse> getEmployeesByRole(Long role_id);
    List<EmployeeResponse> getEmployeesByManager(Long Manager_id);

    // status
    List<EmployeeResponse> getEmployeesByStatus(EmployeeStatus status);
    EmployeeResponse activeEmployee(Long emp_id);
    EmployeeResponse deactivateEmployee(Long emp_id);

    //password
    void changePassword(Long emp_id, ChangePasswordRequest request);
    // validation
    boolean existsByEmployeeCode(String empCode);
    boolean existsByEmail(String email);
    boolean existsByMobileNumber(String mobileNumber);
}
