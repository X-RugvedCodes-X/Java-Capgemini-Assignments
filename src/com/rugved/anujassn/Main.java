package com.rugved.anujassn;

import com.rugved.anujassn.input.Input;

public class Main {
  public static void main(String[] args) {

    int[] arr = Input.inputIntegerArray();

    // int[] arr1 = { 3, 0, 8, 10, 0, -2, 55, 0, 90, 32};
    // int[] arr2 = {1, 4, 9};
    // int[] arr3 = {2, 3, 10, 12, 15};

    // Assn1.minmaxElementInAnArray(arr);

    // Assn2.reverseAnArray(arr1);
    // printArray(arr1);

    // int k = 3;
    // Assn3.rotateArrayBykPlaces(arr1, k);
    // printArray(arr1);

    // Assn4.countEvenOddInArray(arr);

    // Assn5.secondLargestElement(arr1);

    // Assn6.moveZeroesToEnd(arr1);
    // printArray(arr1);

    // int[] mergedArray = Assn7.merge(arr2, arr3);
    // printArray(mergedArray);

    // Assn8.binarySearch(arr3, k);

    // int arr4[] = {2, 7, 11, 15};
    // int target = 9;
    // Assn9.twoSum(arr4, target);

    // int arr5[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    // Assn10.maxSubArraySumKadanesAlgo(arr5);

    // int[] arr6 = {1, 2, 2, 3, 4};
    // int[] arr7 = {2, 2, 2, 3};
    // int[] intersectedArray = Assn11.intersectionOfArrays(arr6, arr7);
    // printArray(intersectedArray);

    // int[] arr8 = {1, 2, 3, 2, 1, 4};
    // Assn12.removeDuplicates(arr8);

    String str = Input.inputString();
    // String str = "ABCDCBA";
    // System.out.println(Assn13.isPalindrome(str) ? "Palindrome" : "Not a Palindrome");

    // String sentence = "My Name is Rugved";
    // Assn14.sentenceReverse(sentence);

    // String str = "ABCDCBA";
    // Assn15.countVowelsAndConsonants(str);

    // String str1 = "listen", str2 = "silent";
    // System.out.println(Assn16.checkAnagram(str1, str2) ? "Anagram" : "Not an Anagram");

    // String str = "ABCDCBA";
    // Assn17.findFirstNonRepeatingCharacter(str);

    // String str = "programming";
    // System.out.println("String after Removing Duplicates: " + Assn18.removeDuplicates(str));

    // String[] arr = {"flower", "flow", "flight"};
    // Assn19.longestCommonPrefix(arr);

    // String str = "This is is a test test test";
    // System.out.println(Assn20.countDuplicateWords(str));

    // System.out.println("Character Frequencies are: " + Assn21.countCharactersUsingHashMap(str));

    // Assn22.removeDuplicatesUsingHashSet(arr);

    // System.out.println(Assn23.checkUniqueCharactersUsingHashSet(str) ? "All Unique" : "No Unique");

    // System.out.println("Missing Number: " + Assn24.missingNumber(arr));
  }

  @SuppressWarnings("unused")
  private static void printArray(int[] arr) {
    for (int x : arr) 
      System.out.print(x + " ");
    System.out.println();
  }
};