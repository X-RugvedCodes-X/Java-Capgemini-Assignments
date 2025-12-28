package com.rugved.anujassn;

import java.util.HashSet;

//* Program to Remove Duplicates From a Array Using HashSet While Preserving Order.*/

public class Assn22 {
  public static void removeDuplicatesUsingHashSet(int[] arr) {
    HashSet<Integer> seen = new HashSet<Integer>();

    System.out.print("Array after removing duplicates: ");
    for (int num : arr) {
      if (!seen.contains(num)) {
        seen.add(num);
        System.out.print(num + " ");
      }
    }
    System.out.println();
  }
};