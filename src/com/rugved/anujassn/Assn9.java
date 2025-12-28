package com.rugved.anujassn;

import java.util.HashMap;

//* Two Sum */

public class Assn9 {
  public static int[] twoSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] ans = {-1, -1};

    for (int i = 0; i < arr.length; ++i) {
      int difference = target - arr[i];

      if(map.containsKey(difference)) {
        ans[0] = map.get(difference);
        ans[1] = i;
        return ans;
      }
      map.put(arr[i], i);
    }
    return ans;
  } 
};