/* Paul Ippolito
CMPT220
1/30/17
This program recieves a number between 0
and 1000 then spplits the number into 
its digits and adds them. So 999 will
equal 27. */

import java.util.Scanner;

public class Int_addition {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Gets number from user
	System.out.println("Enter a number from 0-1000: ");
	int number = input.nextInt();
	//Breaks number into its digits
	int firstDig = number % 10;
	int remainNum = number / 10;
	int secondDig = remainNum % 10;
	remainNum = remainNum / 10;
	int thirdDig = remainNum % 10;
	int sum = firstDig + secondDig + thirdDig;
	//Displays sum of the digits
	System.out.println("The sum of " + number + "'s digits is "
	+ sum + ".");
	
	
  }
}