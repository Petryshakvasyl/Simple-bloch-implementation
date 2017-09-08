package com.pevsat.solid.isp;

import java.util.Date;
import java.util.List;

/**
 * Created by pevsat on 28.08.2017.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

        public CustomerTransaction(Customer customer, List<Product> products){
            this.customer = customer;
            this.products = products;
        }
    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String getProductBreakdown(){
        String result = "";
        for(Product product: products){
            result += product.getProductName();
        };
        return result;
    }
    @Override
    public void preparelInvoice(){
        System.out.println("Invoice prepared");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("charged the customer");
    }
}
