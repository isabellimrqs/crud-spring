package com.isabelli.userdept.repositories;

import com.isabelli.userdept.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {

}
