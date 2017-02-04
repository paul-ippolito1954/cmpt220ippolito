/* Paul Ippolito
CMPT220
2/4/17
The following program gives the user a 
random number between 1 and 12 and the
corresponding month of said number. So
1 is January, 12 is December, etc,. */

public class Rando_month {
  public static void main(String[] args) {
	  //Gets random number
	  int randoMonth = (int) (Math.random() * 12) + 1;
	  
	  //Assigns corresponding month to number
	  if(randoMonth == 1) {
		  System.out.println("January");
	  }
	  else if(randoMonth == 2) {
	      System.out.println("February");
	  }
	  else if(randoMonth == 3) {
	      System.out.println("March");
	  }
	  else if(randoMonth == 4){
		  System.out.println("April");
	  }
	  else if(randoMonth == 5){
		  System.out.println("May");
	  }
	  else if(randoMonth == 6){
		  System.out.println("June");
	  }
	  else if(randoMonth == 7){
		  System.out.println("July");
	  }
	  else if(randoMonth == 8){
		  System.out.println("August");
	  }
	  else if(randoMonth == 9){
		  System.out.println("September");
	  }
	  else if(randoMonth == 10){
		  System.out.println("October");
	  }
	  else if(randoMonth == 11){
		  System.out.println("November");
	  }
	  else if(randoMonth == 12){
		  System.out.println("December");
	  }
	  else{
		  System.out.println("Invalid month range!");
	  }
	  
  }
}