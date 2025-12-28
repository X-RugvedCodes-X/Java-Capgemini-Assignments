package com.rugved.anujassn;

//* Maximum and Minimum elements in an integer array

public class Assn1 {
  public static void minmaxElementInAnArray(int[] arr) {
    if (arr.length == 0) {
      System.out.println("Please Enter Array Elements.");
    } else {
      int maxElement = Integer.MIN_VALUE, minElement = Integer.MAX_VALUE;
  
      for (int i = 0; i < arr.length; ++i) {
        if (arr[i] > maxElement)
          maxElement = arr[i];
  
        if(arr[i] < minElement)
          minElement = arr[i];
      }
  
      System.out.println("Max Element: " + maxElement);
      System.out.println("Min Element: " + minElement);
    }
  }
};