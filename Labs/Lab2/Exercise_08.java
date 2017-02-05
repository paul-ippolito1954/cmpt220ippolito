/* Paul Ippolito
CMPT220
1/30/17
This program recieves three integers
from the user and sorts them in order
from least to greatest */

import java.util.Scanner;

public class Exercise_08{
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Gets number from user
	System.out.println("Enter three numbers: ");
	int numb1 = input.nextInt();
	int numb2 = input.nextInt();
	int numb3 = input.nextInt();
	input.close();
	
	if (numb1 > numb2) {
            numb1 ^= numb2;
            numb2 ^= numb1;
            numb1 ^= numb2;
        }

        if (numb2 > numb3) {
            numb2 ^= numb3;
            numb3 ^= numb2;
            numb2 ^= numb3;
        }

        if (numb1 > numb2) {
            numb1 ^= numb2;
            numb2 ^= numb1;
            numb1 ^= numb2;
        }
        System.out.println("Sorted Numbers: " + numb1 + " " + numb2 + " " + numb3);
	
	
  }
}