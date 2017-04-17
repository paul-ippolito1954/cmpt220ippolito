/**
File: Locating.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 6
Due Date: April 18 2017
Version 1.0
* This program is a class that
*/

import java.util.Scanner;

public class Locating {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows and columns in the array: ");
      int row = input.nextInt();
      int column = input.nextInt();
      double[][] m = new double[row][column];
      System.out.println("Enter the array:");
      for (int i = 0; i < m.length; i++) {
          for (int j = 0; j < m[i].length; j++) {
              m[i][j] = input.nextDouble();
          }
      }
      Location location = Location.locateLargest(m);
      System.out.println("The location of the largest element is "
  + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }

}

class Location{
  public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
      int row = 0;
      int column = 0;
      double maxValue = a[row][column];

      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              if (maxValue < a[i][j]) {
                maxValue = a[i][j];
                row = i;
                column = j;
              }
          }
      }

        return new Location(row,column,maxValue);
    }
}