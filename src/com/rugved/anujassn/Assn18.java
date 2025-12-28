package com.rugved.anujassn;

//* Program to remove duplicates in String while preserving order */

public class Assn18 {
  public static String removeDuplicates(String str) {
    boolean[] seen = new boolean[256];
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (!seen[ch]) {
        seen[ch] = true;
        result.append(ch);
      }
    }
    return result.toString();
  }
};