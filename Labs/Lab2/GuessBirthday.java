/**
File: GuessBirthday.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 2
Due: 2/14/2017
Version 1.0
/This program asks the user a 
/series of questions related to their
/birthday. The user answers "Y" or "N"
/to the questions and the program then
/guesses the user's birthday
*/
import java.util.Scanner;

public class GuessBirthday {
	public static void main(String[] args){
		String set1 =
		  " 1  3  5  7\n" +
		  " 9 11 13 15\n" +
		  "17 19 21 23\n" +
		  "25 27 29 31";
		String set2 =
		  " 2  3  6  7\n" +
		  "10 11 14 15\n" +
		  "18 19 22 23\n" +
		  "26 27 30 31";
		String set3 =
		  " 4  5  6  7\n" +
		  "12 13 14 15/n" +
		  "20 21 22 23\n" +
		  "28 29 30 31";
		String set4 =
		  " 8  9 10 11\n" +
		  "12 13 14 15\n" +
		  "24 25 26 27\n" +
		  "28 29 30 31";
		String set5 =
		  "16 17 18 19\n" +
          "20 21 22 23\n" +
		  "24 25 26 27\n" +
		  "28 29 30 31";
		  
		int day = 0;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Prompt user to answer questions
		System.out.println("Is your birthday in Set1?\n");
		System.out.println(set1);
		System.out.println("Enter Y for yes and N for no: ");
		char answer = input.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y')
			day += 1;
		//User answers set2 question
		System.out.println("Is your birthday in Set2?\n");
		System.out.println(set2);
		System.out.println("Enter Y for yes and N for no: ");
		answer = input.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y')
			day += 2;
		//User answers set3
		System.out.println("Is your birthday in Set3?\n");
		System.out.println(set1);
		System.out.println("Enter Y for yes and N for no: ");
		answer = input.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y')
			day += 4;
		//Set4 question
		System.out.println("Is your birthday in Set4?\n");
		System.out.println(set1);
		System.out.println("Enter Y for yes and N for no: ");
		answer = input.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y')
			day += 8;
		//Set 5
		System.out.println("Is your birthday in Set5?\n");
		System.out.println(set1);
		System.out.println("Enter Y for yes and N for no: ");
		answer = input.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y')
			day += 16;
		//Prints guess of birthday
		System.out.println("Your birthday is " + day + "!");
	
	}
}