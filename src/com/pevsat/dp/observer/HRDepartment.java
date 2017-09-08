package com.pevsat.dp.observer;

import com.pevsat.dp.observer.domain.Employee;

import java.util.List;

/**
 * Created by pevsat on 30.08.2017.
 */
public class HRDepartment implements IObserver{

    private Employee employee;
    private List<Employee> employees;

    @Override
    public void callMe() {
        System.out.println(" HR department notify... ");
    }
}
