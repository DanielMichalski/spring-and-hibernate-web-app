package com.springandhibernate.dao;

import com.springandhibernate.entity.EmployeeEntity;

import java.util.List;

public interface IEmployeeDao {
    public void addEmployee(EmployeeEntity employee);

    public List<EmployeeEntity> getAllEmployees();

    public void deleteEmployee(Integer employeeId);
}