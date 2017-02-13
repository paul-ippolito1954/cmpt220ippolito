/**
File: Ascii.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 2
Due: 2/14/2017
Version 1.0
/This program gets an integer between 0
/and 127 and displays its subsequent
/character.
*/
import java.util.Scanner;

public class Ascii {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Gets ASCII code
		System.out.println("Enter an ASCII code: ");
		int number = input.nextInt();
		//Converts to character
        System.out.println("The character for ASCII code " + number + " is " + (char) number);
		
	}
}