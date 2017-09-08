package com.pevsat.dp.observer;

import com.pevsat.dp.observer.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pevsat on 30.08.2017.
 */
public class EmployeeDao {

    Employee emp1 = new Employee("Make", null, 4999, false);
    Employee emp2 = new Employee("Jum", null, 2500, false);
    Employee emp3 = new Employee("Nick", null, 3200, false);
    Employee emp4 = new Employee("Jorg", null, 10000, false);
    Employee emp5 = new Employee("Greg", null, 2650, false);

    List<Employee> employees;

    public List<Employee> generateEmployee(){
        employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
