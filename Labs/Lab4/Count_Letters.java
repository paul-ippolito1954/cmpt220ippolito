/**
File: Count_Letters.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 4
Due 2/28/17
Version 1.0
* This program uses a method to
* count the number of letters within
* a string given by the user
*/
import java.util.Scanner;

public class Count_Letters {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or phrase, maybe even a name: ");
		String s = input.nextLine();
		System.out.println("Number of letters in " + s + " is " + countLetters(s));
	}
	  public static int countLetters(String s){
			int letterAmount = 0;
			for (int i = 0; i < s.length(); i++){
				if (isLetter(s.charAt(i))) letterAmount++;
			}
			return letterAmount;
		}
		  public static boolean isLetter(char ch){
				ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
			}
}