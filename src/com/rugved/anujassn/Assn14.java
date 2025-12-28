package com.rugved.anujassn;

//* Program to Reverse the order of words in a given sentence */

public class Assn14 {
  public static void sentenceReverse(String str) {
    char chars[] = str.toCharArray();
    int start = 0, end = str.length() - 1;

    while(start < end) {
      char temp = chars[start];
      chars[start] = chars[end];
      chars[end] = temp;

      start++;
      end--;
    }

    String reversed = new String(chars);
    System.out.println("Reversed Sentence: " + reversed);
  }
};