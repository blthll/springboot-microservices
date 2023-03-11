package com.devhb.employeeservice.service;

import com.devhb.employeeservice.dto.APIResponseDto;
import com.devhb.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
