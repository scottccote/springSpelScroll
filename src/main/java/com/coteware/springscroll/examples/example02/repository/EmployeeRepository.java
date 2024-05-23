package com.coteware.springscroll.examples.example02.repository;


import com.coteware.springscroll.examples.example02.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
