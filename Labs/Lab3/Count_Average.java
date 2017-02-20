/**
File: Count_Average.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 3
Due: 2/21/2017
Version 1.0
* Using a do-while loop, this program
* reads an unspecified number of integers
* and then determines how many of the values
* are positive and negative, then calculates
* the average and displays it as a floating-point
* number. The program input ends when 0 is entered
*/
import java.util.Scanner;
public class Count_Average{
	public static void main(String[] args){
		//Variables holding pos/neg/total/average
		int pos = 0;
		int neg = 0;
		int total = 0;
		double avg = 0;
		int buff;
		//Scanner created and input prompt
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer. Input ends if you type 0.");
		//Accepts integers until user inputs 0
		do {
			buff = input.nextInt();
			if (buff > 0) pos++;
			else if (buff < 0) neg++;
			total += buff;
			if (pos + neg == 0)
				System.out.println("You only entered 0...");
		} while (buff != 0);
		//Prints results
		avg = total/(double)(pos + neg);
		System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);
        System.out.println("The total is " + total);
        System.out.println("The average is " + avg);
	}
}