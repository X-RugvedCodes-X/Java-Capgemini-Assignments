package com.rugved.anujassn;

import java.util.ArrayList;
import java.util.HashMap;

//* Intersection of Two arrays including Duplicates */

public class Assn11 {
  public static int[] intersectionOfArrays(int[] arr1, int[] arr2) {
    int[] intersectedArray = null;
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    ArrayList<Integer> resultList = new ArrayList<>();

    for (int num : arr1) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    for (int num : arr2) {
      if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
        resultList.add(num);
        freqMap.put(num, freqMap.get(num) - 1);
      }
    }

    intersectedArray = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      intersectedArray[i] = resultList.get(i);
    }
    return intersectedArray;
  }
};