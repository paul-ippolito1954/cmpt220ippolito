/* Paul Ippolito
CMPT220
1/30/17
 This program gets input from the user of their
 averages for each of the four rubrics from the
 CMPT220 course and then calculates the final 
 average. It also gives the corresponding letter
grade to the user. */

import java.util.Scanner;

public class Grade_calc {
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
	//Assigns corresponding letter grade
	if(fin >= 95){
		System.out.println("A");
	}
	else if(fin >= 90){
		System.out.println("A-");
	}
	else if(fin >= 87){
		System.out.println("B+");
	}
	else if(fin >= 83){
		System.out.println("B");
	}
	else if(fin >= 80){
		System.out.println("B-");
	}
	else if(fin >= 77){
		System.out.println("C+");
	}
	else if(fin >= 73){
		System.out.println("C");
	}
	else if(fin >= 70){
		System.out.println("C-");
	}
	else if(fin >= 65){
		System.out.println("D+");
	}
	else if(fin >= 60){
		System.out.println("D");
	}
	else{
		System.out.println("F");
	}
	
	
	
  }
}