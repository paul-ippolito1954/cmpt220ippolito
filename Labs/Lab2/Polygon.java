/*
Created by Paul Ippolito
CMPT220
Exercise 4.5
Lab 2
2/6/2017
Due 2/7/17
Version 1.0
This program prompts the user to enter
the number of sides and the length,
then computes the area of a regular
polygon
*/

import java.util.Scanner;

public class Polygon {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Gets number of sides and length
		System.out.println("Enter the number of sides: ");
		double sides = input.nextDouble();
		System.out.println("Enter the length: ");
		double length = input.nextDouble();
		//Calculates area of the polygon
		double area = (sides * length * length) / (4.0 * Math.tan(Math.PI / sides));
		System.out.println("The area of the polygon is " + area + ".");
		
	}
}