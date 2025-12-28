package com.rugved.anujassn;

//* Program to Reverse an Array */

public class Assn2 {
  public static void reverseAnArray(int[] arr, int start, int end) {
    while(start < end) {
      int temp    = arr[start];
      arr[start]  = arr[end];
      arr[end]    = temp;
      start++;
      end--;
    }
  }
};