/**
File: SelectionSort.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 5
Due: 3/28/17
Version 1.0
* This program uses a method that uses the                                     
* selection sort method, but instead of
* finding the smallest numbers, it finds the largest.
* It reads in 10 double values then sorts them using the method. 
*/

import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args){
    final int SIZE = 10;
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[SIZE];
    System.out.println("Enter ten numbers to be sorted.");
    for (int i = 0; i < numbers.length; i++)
      numbers[i] = input.nextDouble();
    selectionSort(numbers);
    printArray(numbers, 10);
  }
  
  public static void selectionSort(double[] numbers){
    for (int i = numbers.length - 1; i > 1; i--){
      int currIndex = i;
      double currHigh = numbers[i];
      for (int k = i -1; k > 0; k--){
        if (currHigh < numbers[k]){
          currIndex = k; //Saves highest index value
          currHigh = numbers[k];
        }
      }
      // if currIndex changed swap
      if (currIndex != i){
        double tem = numbers[currIndex];
        numbers[currIndex] = numbers[i];
        numbers[i] = tem;
      }
    }
  }
  
  public static void printArray(double[] array, int numPerLine){
    for (int i = 0; i < array.length; i++){
      System.out.printf("%5.2f ", array[i]);
      if ((i + 1) % numPerLine == 0) 
        System.out.println("");
    } 
  }
}
