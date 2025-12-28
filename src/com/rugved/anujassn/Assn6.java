package com.rugved.anujassn;

//* Move Zeroes to End while preserving the Relative Order. */

public class Assn6 {
  public static void moveZeroesToEnd(int[] arr) {
    int idx = 0;

    for (int i = 0; i < arr.length; ++i) {
      if (arr[i] != 0) {
        swap(arr, i, idx);
        idx++;
      }
    }
  } 

  private static void swap (int[] arr, int start, int end) {
    if (start == end) return;
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
};  