package com.vitaliisumka.spring_hibernate.dao;

import com.vitaliisumka.spring_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
