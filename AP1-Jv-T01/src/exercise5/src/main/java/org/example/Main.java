package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    boolean check = false;
    while (!check) {
      try {
        n = scanner.nextInt();
        if (n <= 0) {
          System.out.println("Input error. Size <= 0");
          return;
        } else {
          check = true;
        }
      } catch (InputMismatchException e) {
        System.out.println("Couldn't parse a number. Please, try again");
        scanner.nextLine();
        continue;
      }
      int[] masiv = new int[n];
      ArrayList<Integer> res = new ArrayList<>();
      int i = 0;
      while (i < n) {
        int number = 0;
        try {
          number = scanner.nextInt();
          masiv[i] = number;
        } catch (InputMismatchException e) {
          System.out.println("Couldn't parse a number. Please, try again");
          scanner.nextLine();
          continue;
        }
        if (ferstAndLastNumber(number)) {
          res.add(number);
        }
        i++;
      }

      if (!res.isEmpty()) {
        System.out.println();
        for (int j : res) { // изменить на while
          System.out.print(j + " ");
        }
      } else {
        System.out.println("There are no such elements");
      }
      scanner.close();
    }
  }

  private static boolean ferstAndLastNumber(int number) {
    if (number >= 0 && number <= 9) {
      return true;
    }
    int absValue = Math.abs(number);

    int firstNumber = absValue / (int) Math.pow(10, (int) (Math.log10(absValue)));

    int LastNumber = absValue % 10;

    return firstNumber == LastNumber;
  }
}
