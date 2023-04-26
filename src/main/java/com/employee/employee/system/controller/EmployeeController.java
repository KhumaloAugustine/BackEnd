package com.employee.employee.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.system.Repo.EmployeeRepo;
import com.employee.employee.system.models.Employee;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired 
    private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee>getEmployees(){
        return employeeRepo.findAll();
    }

    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> findOne(Employee employee){
        return employeeRepo.findById(employee.getEmpId());
    }
    
    @PutMapping("{id}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee){
        return employeeRepo.save(employee);
    }



}
