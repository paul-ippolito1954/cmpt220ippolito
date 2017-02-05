/*
Paul Ippolito
CMPT220
2/5/2017
This Program generates a lottery then
prompts the user to guess a lottery 
number, if their guess matches, they win
10,000, if they have all the digits but
not in the correct order they win 3,000,
if one digit matches they win 1,000, and
if none of the digits match they get 
nothing
*/
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        // Generate a lottery
        int lottery = (int) (Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lottery1 = lottery / 100;
        int lottery2 = lottery % 100 / 10;
        int lottery3 = lottery % 10;

        // Get digits from guess
        int guess1 = lottery / 100;
        int guess2 = lottery % 100 / 10;
        int guess3 = lottery % 10;
		
		switch(guess){
			case 1:
			if (guess == lottery) {
            System.out.println("Exact match: you win $10,000!");
			break;
			}
	        
			case 2:
			  if (((guess2 == lottery1) && (guess1 == lottery2) && (guess3 == lottery3)) ||
                ((guess1 == lottery1) && (guess3 == lottery2) && (guess2 == lottery3)) ||
                ((guess3 == lottery1) && (guess1 == lottery2) && (guess2 == lottery3)) ||
                ((guess2 == lottery1) && (guess3 == lottery2) && (guess1 == lottery3)) ||
                ((guess3 == lottery1) && (guess2 == lottery2) && (guess1 == lottery3))) {
					System.out.println("Match all digits: you win $3,000!");
					break;
				}
				
		    case 3:
			  if ((guess == lottery1) || (guess1 == lottery2) || (guess1 == lottery3) ||
                (guess2 == lottery1) || (guess2 == lottery2) || (guess2 == lottery3) ||
                (guess3 == lottery1) || (guess3 == lottery2) || (guess3 == lottery3)) {
					System.out.println("Match one digit: you win $1,000!");
					break;
				}
			
			default:
			  System.out.println("No matches...");
            
		
		
		
		}
}
}