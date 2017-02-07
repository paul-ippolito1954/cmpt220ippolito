/* Paul Ippolito
CMPT220
2/5/2017
Due 2/7/17
Lab 2 assignment
Version 1.01
This program gets a month and year from
the user. Based on the input, the program then 
tells the user how many days were in that month
during that particular year. */

import java.util.Scanner;

public class Calendar{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numDays = 0; //Holds place of number
		String name = "No name"; // holds place
		//Gets month and year
		System.out.println("Enter a month number: ");
		int month = input.nextInt();
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		switch(month){
			case 1:
			  name = "January";
			  numDays = 31;
			  break;
			  
			case 2:
			  name = "February";
			  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
				  numDays = 29;
			  }
			  else
				  numDays = 28;
			  break;
			  
			case 3:
			  name = "March";
			  numDays = 31;
			  break;
			  
			case 4:
			  name = "April";
			  numDays = 30;
			  break;
			  
			case 5:
			  name = "May";
			  numDays = 31;
			  break;
			
			case 6:
			  name = "June";
			  numDays = 30;
			  break;
			  
			case 7:
			  name = "July";
			  numDays = 31;
			  break;
			  
			case 8:
			  name = "August";
			  numDays = 31;
			  break;
			
			case 9:
			  name = "September";
			  numDays = 30;
			  break;
			  
			case 10:
			  name = "October";
			  numDays = 31;
			  break;
			
			case 11:
			  name = "November";
			  numDays = 30;
			  break;
			
			case 12:
			  name = "December";
			  numDays = 31;
			  
			 
			  
		}
		System.out.println("The number of days in "+ name + " in " + year + " was " + numDays + ".");
		
		
	}
}