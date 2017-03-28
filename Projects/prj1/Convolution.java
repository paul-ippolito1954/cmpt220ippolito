/**
File: Convolution.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Project 1
Due: 3/28/17
Version 1.1
* This program recieves the size of two arrays,
* then the elements of the arrays, and then uses
* the principle of convolution to multiply the two
* arrays and returns the multiplied array.
*/

import java.util.Scanner;

public class Convolution {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of the first array: ");

    int size = input.nextInt();

    double[] array = new double[size];

    System.out.println("Please enter the size of the 2nd array: ");

    size = input.nextInt();

    System.out.println("Please enter the elements of the 1st array: ");

       for (int vFirst = 0; vFirst < array.length; vFirst++){

      array[vFirst] = input.nextDouble();

    }

    System.out.println("Please enter the elements of the 2nd array: ");

    double[] array2 = new double[size];

   

       for (int vSecond = 0; vSecond < array2.length; vSecond++){

      array2[vSecond] = input.nextDouble();

    }

    double[] vResult = convolveVectors(array, array2);

   
       // Prints convolved array
       System.out.println("The convolved array is: ");
       for (int vFirst = 0; vFirst < vResult.length; vFirst++){

      System.out.print((int) vResult[vFirst] + " ");

    }

  }

 
// Method to convolve arrays
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];

    for (int cResult = 0; cResult < vResult.length; cResult++){

      for (int shift = 0; shift < vSecond.length; shift++){
        
        // Keeps code from going out of bounds but still convolves.
        try {
          vResult[cResult] += (vFirst[cResult - shift] * vSecond[shift]);
        } catch (IndexOutOfBoundsException e){
          
        }
      }

    }

    return vResult; 

  }

}