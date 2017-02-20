/**
File: Tuition.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* This program computes the cost of
* tuition in ten years if it increases
* 5% every year and the total cost of four
* years following the tenth
*/
public class Tuition{
	public static void main(String[] args){
		final int TUITION = 10000;
		double interest = 0.05;
		double tenYears = TUITION;
		double fourYears = 0;
		for (int i = 0; i < 10; i++){
			tenYears *= (1 + interest);
		}
		fourYears = tenYears;
		System.out.println("Cost in 10 years is " + tenYears + ".");
		for (int i = 0; i < 4; i++){
			fourYears *= (1 + fourYears);
		}
		System.out.println("Total cost for 4 years is " + fourYears + ".");
	}
}
