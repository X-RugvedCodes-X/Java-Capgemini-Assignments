package com.rugved.anujassn;

//* Binary Search */

public class Assn8 {
  public static void binarySearch(int[] arr, int target) {
    int start = 0, end = arr.length - 1, index = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        index = mid;
        break;
      }
      else if(arr[mid] < target)
        start = mid + 1;
      else 
        end = mid - 1;
    }
    System.out.println(index != -1 ? "Element Found at: " + index : "Element Not Present in the Array.");
  }
};