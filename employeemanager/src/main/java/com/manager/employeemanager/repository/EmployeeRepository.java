package com.manager.employeemanager.repository;

import com.manager.employeemanager.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
