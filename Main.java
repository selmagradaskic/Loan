package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Input an annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Input a number of years: ");
        int numOfyears = input.nextInt();

        System.out.println("Input a loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numOfyears, loanAmount);

        System.out.println("Loan was created on: "+ loan.getDateOfLoan() + "., with annual interest rate "+annualInterestRate+ ", loan amount "+loanAmount+" at "+numOfyears+" years.");
        System.out.println("Montly Payment: "+loan.getMonthlyPayment()+" and total payment: "+loan.getTotalPayment());

















    }
}
