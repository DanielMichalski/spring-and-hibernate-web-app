package com.springandhibernate.service;

import com.springandhibernate.dao.EmployeeDAO;
import com.springandhibernate.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public void addEmployee(EmployeeEntity employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public List<EmployeeEntity> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
