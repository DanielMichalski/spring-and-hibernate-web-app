package com.springandhibernate.dao;

import com.springandhibernate.entity.EmployeeEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao2 implements IEmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEmployee(EmployeeEntity employee) {
        this.sessionFactory.getCurrentSession().save(employee);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return this.sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        EmployeeEntity employee = (EmployeeEntity) sessionFactory.getCurrentSession().load(
                EmployeeEntity.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }


}
