package com.company;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double interestRate){
        super(0);
        this.interestRate = interestRate;
    }

    public void showInfo(){
        System.out.println("Savings account, Balance: " + getBalance() + " Interest rate: " + interestRate);
    }
}
