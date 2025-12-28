package com.rugved.anujassn;

//* Merge two Sorted Arrays */

public class Assn7 {
  public static int[] merge(int[] arr1, int[] arr2) {
    int arr1Pointer = 0, arr2Pointer = 0, arr1Size = arr1.length, arr2Size = arr2.length;

    int[] newArr = new int[arr1Size + arr2Size];
    int newArrPointer = 0;

    while(arr1Pointer < arr1Size && arr2Pointer < arr2Size) {
      if (arr1[arr1Pointer] <= arr2[arr2Pointer]) {
        newArr[newArrPointer++] = arr1[arr1Pointer++];
      } else {
        newArr[newArrPointer++] = arr2[arr2Pointer++];
      }
    }

    while (arr1Pointer < arr1Size) {
      newArr[newArrPointer++] = arr1[arr1Pointer++];
    }

    while (arr2Pointer < arr2Size) {
      newArr[newArrPointer++] = arr2[arr2Pointer++];
    }

    return newArr;
  }
};