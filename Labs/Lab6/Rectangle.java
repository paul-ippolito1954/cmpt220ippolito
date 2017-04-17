/**
File: .java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 6
Due Date: April 18 2017
Version 1.0
* This program is a class that represents a rectangle
* with two methods: one returns the area and the other
* returns the perimeter. The program creates two rectangles
* and then displays their width, height, area, and perimeter
* of each rectangle in the above order.
*/

public class Rectangle {
  public static void main(String[] args){
    MyRec2[] rectangles = new MyRec2[2];
    rectangles[0] = new MyRec2(4,40);
    rectangles[1] = new MyRec2(3.5, 35.9);
    for (int i = 0; i < 2; i++){
      System.out.println("MyRec2 " + (i+1) +":");
      System.out.print("Area = " + rectangles[i].getArea());
      System.out.println("Perimeter = " + rectangles[i].getPerimeter() +"\n");
    }
}

 public static class MyRec2 {

    private double width;
    private double height;

    public MyRec2() {
      this.width = 1.0;
      this.height = 1.0;
    }

    public MyRec2(double width, double height) {
      this.width = width;
      this.height = height;
    }

    /** return area **/
    public double getArea() {
      return this.width * this.height;
    }
    /** return perimeter **/
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

  }
}