/**
File: Partition.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 5
Due: 3/28/17
Version 1.0
* This program recieves a list from the user, performs a partition, and returns
* the new partitioned list.
*/

import java.util.Scanner;

public class Partition {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("First number = size of array, second number = pivot ");
    System.out.print("Enter a list:");
    int size = input.nextInt();
    int[] list = new int[size];
    for (int i = 0; i < size; i++) list[i] = input.nextInt();

    partition(list);
    System.out.println(list);
  }
  
  public static int partition(int[] list){
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    int pivot = list[first];
    
    while (high > low){
      while (low <= high && list[low] <= pivot) low++;
      while (low <= high && list[high] > pivot) high--;
      
      if (high > low){
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
      while (high >= low && list[high] >= pivot) high--;
      
       if (high > first){
         int temp = list[high];
         list[high] = list[first];
         list[first] = temp;
         return high;
       }
       else{
         return first;
       }
    }
    return 0;
  }
}