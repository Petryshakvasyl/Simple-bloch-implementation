package com.pevsat.dp.observer;

import com.pevsat.dp.observer.domain.Employee;

/**
 * Created by pevsat on 30.08.2017.
 */
public class App {

    public static void main(String[] args) {
        IObserver payroll = new PayRollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ms = new EmployeeManagementSystem();

        ms.registerObserver(payroll);
        ms.registerObserver(hrSystem);

        Employee jek = new Employee("Jek", null, 8000, true);
        ms.hireNewEmployee(jek);

    }
}
