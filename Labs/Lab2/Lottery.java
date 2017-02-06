/*
Paul Ippolito
CMPT220
2/5/2017
Lottery.java
Version 1.01
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
	
    public static void main(String[] args){
		int lottery = (int)(Math.random() * 100);
		//Get Lottery digits
		int lot1 = lottery / 10;
		int lot2 = lottery % 10;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three digit number: ");
		//Gets user guess and breaks into digits
		int guess = input.nextInt();
		int guessDig1 = guess / 10;
		int guessDig2 = guess % 10;
		//Store guess in temporary variable to get cases
		int tempGuess;
		if(guess == lottery)
			tempGuess = 1;
		else if(guessDig2 == lot1 && guessDig2 == lot2)
			tempGuess = 2;
		else if(guessDig1 == lot1 || guessDig2 == lot2 ||guessDig2 == lot1
		        || guessDig1 == lot2)
			tempGuess = 3;
		else
			tempGuess = 4;
		//Switch statement that decides if user has won
		switch(tempGuess){
			case 1: System.out.println("Perfect match! You win $10,000!");
			  break;
			case 2: System.out.println("All digits match! You win $3000!");
			  break;
			case 3: System.out.println("Matched one digit! You win $1000!");
			  break;
			case 4: System.out.println("No matches...no money. Play again!");
			  break;
		}
	}
}

    

