package com.pevsat.solid.sr.domain.dao;

import com.pevsat.solid.sr.domain.Employee;

/**
 * Created by pevsat on 25.08.2017.
 */
public interface EmployeeDao {

    public boolean saveEmployee(Employee employee);
    public boolean deleteEmpoyee(Employee employee);

}
