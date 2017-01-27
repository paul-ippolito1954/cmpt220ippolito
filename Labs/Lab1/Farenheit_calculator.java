/* Paul Ippolito
CMPT220
1/27/17
This program gets a double value from the
user as input for celsius, then converts
the Celsius temp into Farenheit */

import java.util.Scanner;

public class Farenheit_calculator {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Celsius temperature.");
	double cels = input.nextDouble();
	double faren = (9.0/5) * cels + 32;
	System.out.println("The Farenheit temperature of "
	 + cels + " Celsius is " + faren + ".");
  }
}