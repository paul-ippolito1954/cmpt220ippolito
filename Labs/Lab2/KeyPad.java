/**
File: KeyPad.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 2
Due: 2/14/2017
Version 1.0
/This program asks the user to
/enter a letter. The program then
/returns its corresponding number.
*/
import java.util.Scanner;



public class KeyPad {
	private static final int INVALID_KEY = -1;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char ch = input.next().charAt(0);
		int numberPressed = correspondingNumber(ch);
		if (numberPressed != INVALID_KEY)
			System.out.println("The correpsonding number is " +numberPressed);
		else
			System.out.println("Invalid input");
		       
	}
	public static int correspondingNumber(char ch){
		ch = Character.toUpperCase(ch);
		if (ch >= 'A' && ch <= 'O'){
			int number = 2;
			int n = ch - 'A';
			number += (n/3);
			return number;
		}
		if (ch >= 'P' && ch <= 'S') return 7;
        if (ch >= 'T' && ch <= 'V') return 8;
        if (ch >= 'W' && ch <= 'Z') return 9;
		return INVALID_KEY;
		
			
	}
}
