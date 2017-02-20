/**
File: Largest_N.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* This program uses a while loop
* to find the largest integer n 
* such that n^3 is < 12000.
*/
public class Largest_N{
	public static void main(String[] args){
		int n = 0;
		while (Math.pow(n, 3) < 12000){
			n++;
		}
		n--;
		System.out.println(n + " is the lowest number, such that n^3 is less than 12,000");
	}
}