/**
File: Merge_List.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 5
Due: 3/28/17
Version 1.0
* This program recieves two lists from the user
* and then sorts and merges the two lists. Afterwards
* the program then displays the merged list. 
*/

import java.util.Scanner;

public class Merge_List {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get first list and save to array
        System.out.print("Enter list1: ");
        int size = input.nextInt();
        int[] list1 = new int[size];
        for (int i = 0; i < list1.length; i++) list1[i] = input.nextInt();

        // get second list and save to array
        System.out.print("Enter list2: ");
        size = input.nextInt();
        int[] list2 = new int[size];
        for (int i = 0; i < list2.length; i++) list2[i] = input.nextInt();

        int[] mergedList = merge(list1, list2);

        displayGrid(mergedList);
    }
    public static int[] merge(int[] list1, int[] list2) {
      

      int[] merge = new int[list1.length + list2.length];
      int m = 0, l1 = 0, l2 = 0;
      boolean isL1Finished = false;
      boolean isL2Finished = false;

      while (!isL1Finished || !isL2Finished) {
        
        if (l1 == list1.length) isL1Finished = true;
        if (l2 == list2.length) isL2Finished = true;

        if (isL1Finished && isL2Finished) break;

        if (!isL1Finished && isL2Finished) merge[m++] = list1[l1++];
        else if (!isL2Finished && isL1Finished) merge[m++] = list2[l2++];
        else if (list1[l1] <= list2[l2]) merge[m++] = list1[l1++];
        else if (list2[l2] <= list1[l1]) merge[m++] = list2[l2++];

      }
        return merge;
    }

    public static void displayGrid(int[] grid) {
        for (int i = 0; i < grid.length; i++) {
          System.out.printf("%-3d ", grid[i]);
          if ((i + 1) % 10 == 0)
              System.out.println("");
        }

    }

}