package com.pevsat.dp.observer;

import com.pevsat.dp.observer.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pevsat on 30.08.2017.
 */
public class EmployeeManagementSystem implements ISubject {

    private String msg;

    private Employee employee;

    private EmployeeDao employeeDao = new EmployeeDao();

    private List<IObserver> observers = new ArrayList<>();

    private List<Employee> employees= employeeDao.generateEmployee();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:observers) {
            observer.callMe();
        }
    }

    public void hireNewEmployee(Employee employee){
        employeeDao.addEmployee(employee);
        notifyObservers();
        System.out.println("New Hire:" + employee.getName());
    }
}
