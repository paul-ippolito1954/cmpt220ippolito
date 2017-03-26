/**
File: Convolution.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Project 1
Due: 3/28/17
Version 1.0
* This program recieves the size of two vector,
* then the elements of the vector, and then uses
* the principle of convolution to multiply the two
* vectors and returns the multiplied vector.
*/

import java.util.Scanner;

public class Convolution {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the size of the first vector: ");

    int size = input.nextInt();

    double[] array = new double[size];

    System.out.println("Please enter the size of the 2nd vector: ");

    size = input.nextInt();

    System.out.println("Please enter the elements of the 1st vector: ");

   

       for (int vFirst = 0; vFirst < array.length; vFirst++){

      array[vFirst] = input.nextDouble();

    }

    System.out.println("Please enter the elements of the 2nd vector: ");

    double[] array2 = new double[size];

   

       for (int vSecond = 0; vSecond < array2.length; vSecond++){

      array2[vSecond] = input.nextDouble();

    }

    double[] vResult = convolveVectors(array, array2);

   

       for (int vFirst = 0; vFirst < vResult.length; vFirst++){

      System.out.print((int) vResult[vFirst] + " ");

    }

  }

 

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];

    for (int cResult = 0; cResult < vResult.length; cResult++){

      vResult[cResult] = 0;

      for (int shift = 0; shift < 51; shift++){

        double sum = 0;

        if (cResult - shift >= 0 && cResult - shift < vFirst.length){

          if (cResult >= 0 && cResult < vSecond.length)

            sum = (vFirst[cResult - shift] * vSecond[shift]);

        }

        vResult[cResult] += sum;

      }

    }

    return vResult; 

  }

}