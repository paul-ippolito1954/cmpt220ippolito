/**
File: Palindrome.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* This program recieves an integer
* from the user and tells them whether
* or not the integer is a palindrome.
*/
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		if (isPalindrome(num))
			System.out.println(num + " is a palindrome!");
		else
			System.out.println(num + " is NOT a palindrome!");
	}
	public static int reverse(int number){
		int reverse = 0;
		while(number != 0){
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		return reverse;
	}
	public static boolean isPalindrome(int number){
		return (number == reverse(number));
	}
}