package com.isabelli.userdept.controllers;

import com.isabelli.userdept.entities.Department;
import com.isabelli.userdept.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public List<Department> findAll() {
        List<Department> result = repository.findAll();
        return result;
    }



}
