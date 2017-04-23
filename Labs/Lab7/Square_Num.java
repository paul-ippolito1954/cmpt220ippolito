/**
File: Square_Num.java
Author: Paul Ippolito
Course: CMPT220
Assignment: Lab 7
Due Date: April 25 2017
Version 1.0
* This program the first ten square numbers that are larger than
* Long.MAX_VALUE
**/

import java.math.BigDecimal;

public class Square_Num {
  public static void main(String[] args) {
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(start);
    int count = 0;
    while (count < 10) {
      BigDecimal squared = n.multiply(n);
      if (squared.compareTo(longMaxValue) > 0) {
        count++;
        System.out.println(count+": " + n + " squared = " + squared);
      }
      n = n.add(BigDecimal.ONE);
    }
  }
}