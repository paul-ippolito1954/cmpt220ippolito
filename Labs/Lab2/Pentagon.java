/*
Created by: Paul Ippolito
CMPT220
Lab 2 assignment
Version 1.0
Due 2/7/17
This program prompts the user to enter
the length from the center of a pentagon
to a vertex and subsequently computes the 
area
*/
import java.util.Scanner;

public class Pentagon {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Gets length of center to vertex, aka the radius
		System.out.println("Enter the length from the center to a vertex");
		double radius = input.nextDouble();
		//Calculates area of pentagon
		double s = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		System.out.println("The area of the pentagon is " + area + ".");
	}
}