package com.pevsat.solid.sr.clients;

import com.pevsat.solid.sr.domain.Employee;
import com.pevsat.solid.sr.domain.dao.impl.EmployeeDaoImpl;
import com.pevsat.solid.sr.reporting.EmployeeReportFormater;
import com.pevsat.solid.sr.reporting.TypeFormat;

import static com.pevsat.solid.sr.reporting.TypeFormat.CSV;

/**
 * Created by pevsat on 25.08.2017.
 */
public class ClientModule {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Jon");
        employee.setLastName("Smit");
        employee.setWorking(true);

        hireNewEmployee(employee);
        printEmployeeReport(employee, CSV);

    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.saveEmployee(employee);
    }

    public static void terminanteEmployee(Employee employee){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.deleteEmpoyee(employee);
    }

    public static void printEmployeeReport(Employee employee, TypeFormat typeFormat){
        EmployeeReportFormater reportFormater = new EmployeeReportFormater(employee, typeFormat);
        System.out.println(reportFormater.getFormatedOutput());

    }

}
