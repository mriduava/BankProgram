package com.company;

public class InvestmentAccount extends Account {

    public InvestmentAccount() {
        super(0);
    }

    public void showInfo(){
        System.out.println("Investment account, balance: " + getBalance());
    }
}
