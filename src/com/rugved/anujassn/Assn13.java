package com.rugved.anujassn;

//* Program to Check String Palindrome or not */

public class Assn13 {
  public static boolean isPalindrome(String str) {
    if (str == null || str.length() == 0)
      return true; 

    str = str.toLowerCase();
    // for (int i = 0; i <= str.length() / 2; ++i) {
    //   char start = str.charAt(i), end = str.charAt(str.length() - i - 1);
    //   if (start != end) 
    //     return false;
    // }

    int start = 0, end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) == str.charAt(end)) {
        start++;
        end--;
      } else {
        break;
      }
    }
    return true;
  }
};