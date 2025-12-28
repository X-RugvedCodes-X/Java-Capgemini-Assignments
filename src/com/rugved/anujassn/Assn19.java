package com.rugved.anujassn;

//* Program to find longest Common Prefix in a Given Array of Strings. The longest common prefix is the longest starting substring common to all strings. */

public class Assn19 {
  public static void longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      System.out.println("No strings provided.");
      return;
    }

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);

        if (prefix.isEmpty()) {
          System.out.println("Longest Common Prefix: ");
          return;
        }
      }
    }
    System.out.println("Longest Common Prefix: " + prefix);
  }
};