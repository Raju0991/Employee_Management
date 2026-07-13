package org.nagatech.employeeservice.service;

import org.nagatech.employeeservice.dtos.request.ChangePasswordRequest;
import org.nagatech.employeeservice.dtos.request.EmployeeCreateRequest;
import org.nagatech.employeeservice.dtos.response.EmployeeResponse;
import org.nagatech.employeeservice.enums.EmployeeStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public EmployeeResponse createEmployee(EmployeeCreateRequest request) {
        return null;
    }

    @Override
    public EmployeeResponse updateEmployee(Long emp_id, EmployeeCreateRequest request) {
        return null;
    }

    @Override
    public void deleteEmployee(Long emp_id) {

    }

    @Override
    public EmployeeResponse findEmployeeById(Long emp_id) {
        return null;
    }

    @Override
    public List<EmployeeResponse> findAllEmployees() {
        return List.of();
    }

    @Override
    public Page<EmployeeResponse> findAllEmployees(Pageable pageable) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeByEmployeeCode(String empCode) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeByEmail(String email) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeByMobileNumber(String mobileNumber) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getEmployeesByFirstName(String firstName) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByLastName(String lastName) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> searchEmployees(String keyword) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByDepartmentId(Long dept_id) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByDesignation(Long designation_id) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByRole(Long role_id) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByManager(Long Manager_id) {
        return List.of();
    }

    @Override
    public List<EmployeeResponse> getEmployeesByStatus(EmployeeStatus status) {
        return List.of();
    }

    @Override
    public EmployeeResponse activeEmployee(Long emp_id) {
        return null;
    }

    @Override
    public EmployeeResponse deactivateEmployee(Long emp_id) {
        return null;
    }

    @Override
    public void changePassword(Long emp_id, ChangePasswordRequest request) {

    }

    @Override
    public boolean existsByEmployeeCode(String empCode) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public boolean existsByMobileNumber(String mobileNumber) {
        return false;
    }
}
