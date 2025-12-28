package com.rugved.anujassn;

import java.util.ArrayList;
import java.util.HashSet;

//* Program to Remove duplicates while preserving original Order */

public class Assn12 {
  public static void removeDuplicates(int[] arr) {

    HashSet<Integer> seen = new HashSet<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    for (int num : arr) {
      if (!seen.contains(num)) {
        seen.add(num);
        result.add(num);
      }
    }

    System.out.print("Array after removing duplicates: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
};