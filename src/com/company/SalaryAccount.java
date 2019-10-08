package com.company;

public class SalaryAccount extends Account{

    public SalaryAccount(int balance){
        super(balance);
    }

    public void showInfo(){
        System.out.println("Salary account, Balance: " + getBalance());
    }
}
