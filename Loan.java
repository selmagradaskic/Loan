package com.company;

import java.util.Date;

public class Loan {

    private double annualInterestRate ;
    private int numOfyears;
    private double loanAmount;
    private java.util.Date dateOfLoan;

    public Loan(double annualInterestRate, int numOfyears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numOfyears = numOfyears;
        this.loanAmount = loanAmount;
        this.dateOfLoan = new java.util.Date();

    }

    public Loan() {
        this(3.0, 1,2000);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getNumOfYears() {
        return numOfyears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getDateOfLoan() {
        return dateOfLoan;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumOfyears(int numOfyears) {
        this.numOfyears = numOfyears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setDateOfLoan(Date dateOfLoan) {
        this.dateOfLoan = new java.util.Date();
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount*monthlyInterestRate /
                (1-(1 / Math.pow(1+monthlyInterestRate, numOfyears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment =  getMonthlyPayment()*numOfyears*12;
        return totalPayment;
    }


















}
