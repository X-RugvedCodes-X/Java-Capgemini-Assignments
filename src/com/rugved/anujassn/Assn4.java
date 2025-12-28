package com.rugved.anujassn;

//* Program to Count Even and Odd Number in An Array. */

public class Assn4 {
  public static void countEvenOddInArray(int[] arr) {
    int countEven = 0, countOdd = 0;

    for (int num : arr) {
      if (num % 2 == 0)
        countEven++;
      else 
        countOdd++;
    }

    System.out.println("Total Evens: " + countEven);
    System.out.println("Total Odd: "   + countOdd);
  }
};