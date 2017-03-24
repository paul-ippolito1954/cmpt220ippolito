/**
File: Matrix.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 5
Due: 3/28/17
Version 1.0
* This program recieves a two-dimensional array from the user and then displays
* the largest element within the array.
*/
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.printf("Enter the number of rows and columns: ");
      int row = input.nextInt();
      int column = input.nextInt();
      double[][] m = new double[row][column];

      System.out.println("Enter the array below: ");
      for (int i = 0; i < row; i++)
        for (int k = 0; k < column; k++)
          m[i][k] = input.nextDouble();


        int[] location = locateLargest(m);
        System.out.printf("The location of the largest is at (%d, %d)\n", 
                           location[0], location[1]);
    }

    public static int[] locateLargest(double[][] a) {

        int[] location = new int[] { 0, 0 };
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
          for (int k = 0; k < a[i].length; k++) {
            if (a[i][k] > largest) {
              location[0] = i; // row
              location[1] = k; // column
              largest = a[i][k];
            }

          }
        }

      return location;
    }
}
 