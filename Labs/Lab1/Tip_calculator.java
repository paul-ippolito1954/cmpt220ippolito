/* Paul Ippolito
CMPT220
1/27/17
This program recieves a subtotal and
gratuity rate from the user and then computes
a total amount and tip based on the inputs */

import java.util.Scanner;

public class Tip_calculator {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Gets Subtotal
	System.out.println("Enter a subtotal: ");
	double sub = input.nextDouble();
	//Gets grtuity rate
	System.out.println("Enter a gratuity rate: ");
	double gratRate = input.nextDouble();
	double gratu = (gratRate/100.0);
	double gratut = (sub * gratu);
	//Calculates total and gratuity
	double total = sub + (sub * gratu);
	//Displays total and gratuity
	System.out.println("The total is " + total +
	" and the gratuity is " + gratut + ".");
	
  }
}