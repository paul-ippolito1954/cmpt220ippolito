/**
File: Number_Array.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 4
Due: 2/28/17
Version 1.0
* This program prompts the user to
* enter ten numbers. The program then
* uses a method to identify and returns
* the smallest number in the collection.
*/
import java.util.Scanner;

public class Number_Array {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] n = new double[10];
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();
		System.out.println("Minimum number is " + min(n));
	}
	public static double min(double[] array){
		double min = array[0];
		for (int i = 0; i < array.length; i++){
			if (min > array[i]) min = array[i];
		}
		return min;
	}
}