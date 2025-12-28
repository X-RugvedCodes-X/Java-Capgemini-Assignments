package com.rugved.anujassn;

//* Program to Find first Non Repeating Character in a String */

public class Assn17 {
  public static void findFirstNonRepeatingCharacter(String str) {
    int[] freq = new int[256];
    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i)]++;
    }

    for (int i = 0; i < str.length(); i++) {
      if (freq[str.charAt(i)] == 1) {
        System.out.println("First Non-Repeating Character: " + str.charAt(i));
        return;
      }
    }

    System.out.println("No non-repeating character found.");
  }
};