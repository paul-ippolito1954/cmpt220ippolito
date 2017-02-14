/**
File: ComputeChange.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 2
Due: 2/14/2017
Version 1.0
/ This program gets a monetary input
/ from the user and converts it into
/ smaller units/change. So it will 
/ break $1.00 down to 4 quarters, 100
/ pennies, etc. Uses substring and indexOf
/ methods to extract dollar and decimal
/ amounts.
*/
import java.util.Scanner;
public class ComputeChange {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amountS = input.nextLine();
        int amount;

        int pos = amountS.indexOf('.');

        if (pos == -1) {
            amount = Integer.parseInt(amountS);
        } else {
            System.out.println("Here we go!");
            String dollars = amountS.substring(0, pos);
            String cents = amountS.substring(pos + 1);

            System.out.println(dollars);
            System.out.println(cents);
            switch (cents.length()) {
                case 1: cents += "0"; break;
                case 2: cents = cents.substring(0,2); break;
                    default:  cents += "00";
            }
            amount = Integer.parseInt(dollars +cents);
            System.out.println(Integer.parseInt(dollars + cents));
        }

        int remainingAmount = amount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}