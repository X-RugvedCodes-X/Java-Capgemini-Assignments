package com.rugved.anujassn;

import java.util.HashSet;

//* Program to find missing number from 1 to n from a given array of length n - 1 using Hashset */

public class Assn24 {
  public static int missingNumber(int[] arr) {
    HashSet<Integer> set = new HashSet<Integer>();

    for (int num : arr) {
      set.add(num);
    }

    int n = arr.length + 1;
    for (int i = 1; i <= n; i++) {
      if (!set.contains(i)) {
        return i;
      }
    }
    return -1;
  }
};