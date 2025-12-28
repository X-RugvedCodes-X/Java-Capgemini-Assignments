package com.rugved.anujassn;

import java.util.HashMap;

//* Program to Count all Duplicate Words in a String */

public class Assn20 {
  public static int countDuplicateWords(String str) {
    int duplicateWords = 0;

    if (str == null || str.trim().isEmpty())
      return 0;

    str = str.toLowerCase();
    String[] words = str.split("\\s+");
    HashMap<String, Integer> freqMap = new HashMap<String, Integer>();

    for (String word : words) {
      freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
    }

    for (int count : freqMap.values()) {
      if (count > 1)
        duplicateWords++;
    }

    return duplicateWords;
  }
};