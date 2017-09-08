package com.pevsat.dp.observer.domain;

import java.util.Date;

/**
 * Created by pevsat on 30.08.2017.
 */
public class Employee {

    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean working = false;

    private static int counter;

    public Employee(String name, Date hireDate, int salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
        employeeID = ++counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", fired=" + working +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}
