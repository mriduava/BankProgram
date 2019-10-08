package com.company;

import java.util.ArrayList;

public class BankProgram {

    ArrayList<Account> accounts = new ArrayList<>();

    public int numberOfCreatedAccounts;

    public BankProgram(){

    }

    public void start(){
        /*accounts.add(new SalaryAccount(100));
        accounts.add(new SavingsAccount(1.5));
        accounts.add(new InvestmentAccount());

        for (Account account: accounts){
            account.showInfo();
        }*/


        /*for (BankAccountFactory.AccountType accountType: BankAccountFactory.AccountType.values()){
            Account account = BankAccountFactory.createAccount(accountType);
            if (account != null){
                accounts.add(account);
            }
        }
        System.out.println(accounts.size());*/


        /*for (Account account: accounts){
            account.showInfo();
        }*/

        View view = View.getInstance();
        //view.showMenuAndGetChoice();

        View.MenuItem menuItem;

        do {
            menuItem = view.showMenuAndGetChoice();
            switch (menuItem){
                case ADD_SALARY_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.SALARY);
                    break;
                case ADD_SAVINGS_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.SAVINGS);
                    break;
                case ADD_INVESTMENT_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.INVESTMENT);
                    break;
                case ADD_LOAN_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.LOAN);
                    break;
                case SHOW_ACCOUNTS:
                    showAccounts();
                    break;
                case EXIT:
                    break;
                default:
                    break;

            }
        }while (menuItem != View.MenuItem.EXIT);


    }

    private void addAccount(BankAccountFactory.AccountType accountType){
        Account account = BankAccountFactory.createAccount(accountType);
        if (account != null){
            accounts.add(account);
        }
    }

    private void showAccounts(){
        for (Account account: accounts){
            account.showInfo();
        }
    }
}
