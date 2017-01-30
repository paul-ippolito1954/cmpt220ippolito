/* Paul Ippolito
CMPT220
1/30/17
 This program gets input from the user of their
 averages for each of the four rubrics from the
 CMPT220 course and then calculates the final 
 average. */

import java.util.Scanner;

public class Average_calc {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the following as a percentage :");
	//Gets input and converts midterm grade
	System.out.println("Midterm exam: ");
	double midterm = input.nextDouble() * 0.20;
	//Gets input for final exam
	System.out.println("Final Exam: ");
	double finExam = input.nextDouble() * 0.20;
	//Gets project average
	System.out.println("Projects: ");
	double project = input.nextDouble() * 0.20;
	//Gets input for Homework and Labs
	System.out.println("Homework and Labs: ");
	double hwLabs = input.nextDouble() * 0.40;
	//Calculates final average of user
	double fin = midterm + finExam + project + hwLabs;
	System.out.println("Your final average is " + fin + "%.");
	
	
	
  }
}