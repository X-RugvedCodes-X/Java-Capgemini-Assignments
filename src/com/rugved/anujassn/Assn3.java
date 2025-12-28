package com.rugved.anujassn;

//* Rotate Array By K Places */

public class Assn3 {
  //* I will only do Right Rotation */

  public static void rotateArrayBykPlaces(int[] arr, int k) {
    int size = arr.length;
    k = k % size;

    reverse(arr, 0, size - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, size - 1);

  }

  private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
};