package com.rugved.anujassn;

//* Maximum SubArray Sum using Kadane's Algorithm */

public class Assn10 {
  public static void maxSubArraySumKadanesAlgo(int[] arr) {
    int currentSum = 0, maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; ++i) {
      currentSum += arr[i];
      maxSum = Math.max(maxSum, currentSum);
      if (currentSum < 0)
        currentSum = 0;
    }

    System.out.println("Maximum SubArray Sum: " + maxSum);
  }
};