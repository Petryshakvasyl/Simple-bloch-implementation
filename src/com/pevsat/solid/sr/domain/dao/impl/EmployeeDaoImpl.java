package com.pevsat.solid.sr.domain.dao.impl;

import com.pevsat.solid.sr.domain.Employee;
import com.pevsat.solid.sr.domain.dao.EmployeeDao;

/**
 * Created by pevsat on 25.08.2017.
 */
public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public boolean saveEmployee(Employee employee) {
        System.out.println("I save employee " + employee.getLastName());
        return true;

    }

    @Override
    public boolean deleteEmpoyee(Employee employee) {
        System.out.println("I save employee " + employee.getLastName());
        return true;
    }
}
