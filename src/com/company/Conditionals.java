package com.company;

public class Conditionals {
    public static void main (String []args) {
        totalWages();
//        isLeapYear();
//        isLater();
//        bestMatch();
//        findBestFit();
    }
    public double totalWages(double hours, double rate){
        double wages;
        double wages = totalWages(45, 12.5);
        System.out.println("Wages for 45 hours at $12.50 " + wages);
        wages = totalWages(30, 10);
        System.out.println("Wages for 30 hours at $10.00 " + wages);
        return wages;
    }
}
