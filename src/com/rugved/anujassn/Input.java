package com.rugved.anujassn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
  public static int[] inputIntegerArray() {
    int[] arr  = null;
    Scanner sc = null;
    try {
      sc = new Scanner(System.in);
      System.out.print("Enter Array Elements: ");

      String input = sc.nextLine().trim();
      if (input.isEmpty()) {
        throw new InputMismatchException("Empty input is not allowed");
      }
      input = input.replaceAll("[\\[\\]\\{\\}]", "");
      input = input.replace(",", " ");
      String[] tokens = input.trim().split("\\s+");

      if (tokens.length == 0) {
        throw new InputMismatchException("No numbers provided");
      }
      arr = new int[tokens.length];
      for (int i = 0; i < tokens.length; i++) {
        arr[i] = Integer.parseInt(tokens[i]);
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input! Please enter only integers.");
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Unexpected error occurred.");
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    return arr;
  }

  public static String inputString() {
    Scanner sc = null;
    String input = null;

    try {
      sc = new Scanner(System.in);
      System.out.print("Enter a string: ");

      input = sc.nextLine().trim();

      if (input.isEmpty()) {
        throw new InputMismatchException("Empty string is not allowed.");
      }

      return input;

    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Unexpected error occurred.");
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    return null;
  }

};
