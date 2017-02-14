/**
File: PlateNum.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 2
Due: 2/14/2017
Version 1.0
/This program randomly generates
/a license plate number containing
/three uppercase letters and four digits
*/
public class PlateNum {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = (char)(Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int i = 0; i < 4; i++) {
            char digit1 = (char)(Math.random() * 10 + '0');
            s.append(digit1);
        }
        System.out.println("Your plate number is: " + s);
    }
}