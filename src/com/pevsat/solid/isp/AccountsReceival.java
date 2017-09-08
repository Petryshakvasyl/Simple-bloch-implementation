package com.pevsat.solid.isp;

/**
 * Created by pevsat on 28.08.2017.
 */
public class AccountsReceival {

    private Accounting transactionObject;

    public void accountingPerform(){
        transactionObject.chargeCustomer();
        transactionObject.preparelInvoice();
    }
}
