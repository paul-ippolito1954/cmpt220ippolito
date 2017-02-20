/**
File: Smallest_N.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* This program uses a while loop
* to find the smallest integer n 
* such that n^2 is > 12000.
*/
public class Smallest_N{
	public static void main(String[] args){
		int n = 0;
		while (Math.pow(n, 2) < 12000){
			n++;
		}
		System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
        System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
        System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));
	}
}