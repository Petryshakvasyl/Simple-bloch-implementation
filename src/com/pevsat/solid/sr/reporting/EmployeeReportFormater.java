package com.pevsat.solid.sr.reporting;


import com.pevsat.solid.sr.domain.Employee;

/**
 * Created by pevsat on 25.08.2017.
 */
public class EmployeeReportFormater extends ReportFormatter {


    public EmployeeReportFormater(Employee employee, TypeFormat formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormatedOutput();
    }

}
