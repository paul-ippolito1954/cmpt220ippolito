/**
File: BubbleSort.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 4
Due: 2/28/17
Version 1.0
* This program uses a method that uses
* the bubble sort algorithm to sort an
* array of ten double values that will
* then display the sorted list.
*/
public class BubbleSort {
    public static void main(String[] args) {
        double[] numbers = new double[100];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Math.random() * 200;
        }
        bubbleSort(numbers);
        printArray(numbers, 10);
    }
    public static void printArray(double[] array, int numberPerLine) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%4.0f ", array[i]);
                if ((i + 1) % numberPerLine == 0) System.out.println("");
            }
    }
    public static void bubbleSort(double[] numbers) {
        boolean change;
        do {
            change = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                 }
            }
        } while (change);
    }
}