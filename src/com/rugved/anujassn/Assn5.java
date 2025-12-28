package com.rugved.anujassn;

//* Program to Find Second Largest Integer */

public class Assn5 {
  public static void secondLargestElement(int[] arr) {
    int largest = Integer.MIN_VALUE, secondLargestElement = arr[0], size = arr.length;

    for (int i = 0; i < size; ++i) {
      if(arr[i] > largest) {
        secondLargestElement = largest;
        largest = arr[i];
      }
    }

    System.out.println("Second Largest Element: " + secondLargestElement);
  }
};