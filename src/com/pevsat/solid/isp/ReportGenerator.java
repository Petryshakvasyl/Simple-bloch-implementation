package com.pevsat.solid.isp;

/**
 * Created by pevsat on 28.08.2017.
 */
public class ReportGenerator {
    private Reporting transactionObject;

    public void generateReport(){
        System.out.println(transactionObject.getDate());
        System.out.println(transactionObject.getName());
        System.out.println(transactionObject.getProductBreakdown());
    }
}
