package com.subbutech.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subbutech.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
