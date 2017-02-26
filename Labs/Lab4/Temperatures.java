/**
File: Temperatures.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 4
Due: 2/28/2017
Version 1.0
* This program uses two separate methods
* to convert given temperatures of Celsius into
* Farenheit and vice-versa, then prints them out
* into a table.
*/


public class Temperatures {
  public static void main(String[] args){
    String c = "Celsius";
    String f = "Farenheit";
    System.out.printf("%s%15s | %10s%10s\n", c, f, f, c);
    for( double celsius = 40, farenheit = 120.0; celsius >= 31; celsius--, farenheit -= 10){
      System.out.printf("%4.2f%17.2f | %10.2f%10.2f\n", celsius, celsiusToFarenheit(celsius),
                        farenheit, farenheitToCelsius(farenheit));
    }
  }
    //Separate method to convert to Farenheit
    public static double celsiusToFarenheit(double celsius){
      double farenheit = (9.0/5) * celsius + 32;
      return (9.0/5) * celsius + 32;
    }
    //Separate method to convert Farenheit to Celsius
    public static double farenheitToCelsius(double farenheit){
      double celsius = (5.0/9) * (farenheit - 32);
      return celsius;
    }
}
