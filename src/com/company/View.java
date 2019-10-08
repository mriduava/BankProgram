package com.company;

import java.util.Scanner;

public class View {

    public enum MenuItem{
        ADD_SALARY_ACCOUNT("Add Salary Account"),
        ADD_SAVINGS_ACCOUNT("Add Savings Account"),
        ADD_INVESTMENT_ACCOUNT("Add Investment Account"),
        ADD_LOAN_ACCOUNT(" Add Load Account"),
        SAVE_ACCOUNTS("Save Accounts"),
        LOAD_ACCOUNTS("Loda Account"),
        SHOW_ACCOUNTS("Show Account"),
        SHOW_CUSTOMER_ACCOUNTS("Show Customer Menu"),
        EXIT("Exit")
        ;

        private String description;
        MenuItem(String description){
            this.description = description;
        }
    }

    private static MenuItem menuItem;

    private static View instance = null;

    private View(){
    }

    public static View getInstance() {
        if (instance==null){
            instance = new View();
        }
        return instance;
    }

    public void test(){
        System.out.println("Hello");
    }

    public MenuItem showMenuAndGetChoice(){
        System.out.println("Select one item from the Menu.");
        int i=1;
        for (MenuItem menuItem: MenuItem.values()){
            System.out.println(i + " " + menuItem.description);
            i++;
        }
        Scanner scan = new Scanner(System.in);
        int choiceIndex = scan.nextInt();
        return MenuItem.values()[choiceIndex -1];
    }

    //To Display Error Message
    public void showErrorMessage(String errorMessage){
        System.out.println("Error: " + errorMessage);
    }
}
