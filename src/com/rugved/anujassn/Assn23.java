package com.rugved.anujassn;

import java.util.HashSet;

//* Program to Check whether String has All unique characters Using HashSet */

public class Assn23 {
  public static boolean checkUniqueCharactersUsingHashSet(String str) {
    HashSet<Character> seen = new HashSet<Character>();
    for (int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);

      if (seen.contains(ch)) {
        return false; 
      }

      seen.add(ch);
    }
    return true;
  }
};