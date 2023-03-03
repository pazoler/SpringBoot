package com.example.springboot.dao;

import com.example.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();


//    public void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}