package com.rugved.anujassn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // int[] arr  = null;
    // Scanner sc = null;
    // try {
    //   sc = new Scanner(System.in);
    //   System.out.print("Enter Array Elements: ");

    //   String input = sc.nextLine().trim();
    //   if (input.isEmpty()) {
    //     throw new InputMismatchException("Empty input is not allowed");
    //   }
    //   input = input.replaceAll("[\\[\\]\\{\\}]", "");
    //   input = input.replace(",", " ");
    //   String[] tokens = input.trim().split("\\s+");

    //   if (tokens.length == 0) {
    //     throw new InputMismatchException("No numbers provided");
    //   }
    //   arr = new int[tokens.length];
    //   for (int i = 0; i < tokens.length; i++) {
    //     arr[i] = Integer.parseInt(tokens[i]);
    //   }
    //   System.out.print("Array elements: ");
    //   printArray(arr);

    // } catch (NumberFormatException e) {
    //   System.out.println("Invalid input! Please enter only integers.");
    // } catch (InputMismatchException e) {
    //   System.out.println(e.getMessage());
    // } catch (Exception e) {
    //   System.out.println("Unexpected error occurred.");
    // } finally {
    //   if (sc != null) {
    //     sc.close();
    //   }
    // }


    int[] arr1 = { 3, 0, 8, 10, 0, -2, 55, 0, 90, 32};
    int[] arr2 = {1, 4, 9};
    int[] arr3 = {2, 3, 10, 12, 15};
    int k = 3;

    // Assn1.minmaxElementInAnArray(arr1);

    // Assn2.reverseAnArray(arr1);
    // printArray(arr1);

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

  }

  private static void printArray(int[] arr) {
    for (int x : arr) 
      System.out.print(x + " ");
    System.out.println();
  }
};