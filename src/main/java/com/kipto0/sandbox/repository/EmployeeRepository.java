package com.kipto0.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kipto0.sandbox.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
