/**
File: Sum_Digit.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* This program computes the sum
* of the digits in an integer
*/
import java.util.Scanner;
public class Sum_Digit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long num = input.nextLong();
		System.out.println("The sum of the digits is " + sumDigits(num) + ".");
	}
	public static int sumDigits(long n){
		int sum = 0;
		while(n != 0){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}