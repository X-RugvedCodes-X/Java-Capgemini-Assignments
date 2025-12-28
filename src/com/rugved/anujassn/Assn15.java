package com.rugved.anujassn;

//* Program to Count Vowels and Consonants in A string */

public class Assn15 {
  public static void countVowelsAndConsonants(String str) {
    str = str.toLowerCase();
    int vowelCounter = 0, consonantCounter = 0;

    for (int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCounter++;
      } else {
        consonantCounter++;
      }
    }

    System.out.println("Vowels: " + vowelCounter + " ,Consonants: " + consonantCounter) ;
  }
};