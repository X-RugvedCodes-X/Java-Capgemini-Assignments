package com.rugved.anujassn;

import java.util.HashMap;

//* Program to Count Character Frequencies in A String using Hashmap */

public class Assn21 {
  public static int countCharactersUsingHashMap(String str) {
    if (str == null || str.isEmpty()) {
      System.out.println("Empty string.");
      return 0;
    }

    HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == ' ')
        continue;

      freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }

    for (char key : freqMap.keySet()) {
      System.out.println(key + " → " + freqMap.get(key));
    }
    return freqMap.size();
  }
};