package com.rugved.anujassn;

//* Program to Check Whether Strings are Anagram or not. */
//* Two strings are anagrams if:
//*   They contain the same characters
//*   With the same frequencies
//*   Order does not matter

public class Assn16 {
  public static boolean checkAnagram(String str1, String str2) {
    str1 = str1.replaceAll("\\s+", "").toLowerCase();
    str2 = str2.replaceAll("\\s+", "").toLowerCase();

    if (str1.length() != str2.length())
      return false;

    int[] freq = new int[256]; 

    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i)]++;
    }

    for (int i = 0; i < str2.length(); i++) {
      freq[str2.charAt(i)]--;
    }

    for (int count : freq) {
      if (count != 0)
        return false;
    }

    return true;
  }
};