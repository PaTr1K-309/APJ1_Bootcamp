package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int size = InputSize(scanner);

    double[] result = new double[size];

    AddNumderUserInput(result, scanner);

    selectionSort(result);

    print(result);

    scanner.close();
  }

  public static void selectionSort(double[] result) {
    int size = result.length;

    for (int i = 0; i < size; i++) {
      int minIndex = i;

      for (int j = i + 1; j < size; j++) {
        if (result[j] < result[minIndex]) {
          minIndex = j;
        }
      }

      double temp = result[i];
      result[i] = result[minIndex];
      result[minIndex] = temp;
    }
  }

  private static int InputSize(Scanner scanner) {
    int size = 0;

    boolean check = false;

    while (!check) {
      try {
        size = scanner.nextInt();
        if (size <= 0) {
          System.out.println("Input error. Size <= 0");
        } else {
          check = true;
        }
      } catch (InputMismatchException e) {
        System.out.println("Couldn't parse a number. Please, try again");
        scanner.nextLine();
      }
    }
    return size;
  }

  private static void AddNumderUserInput(double[] res, Scanner scanner) {
    for (int i = 0; i < res.length; i++) {
      boolean val = false;
      while (!val) {
        try {
          res[i] = scanner.nextDouble();
          val = true;
        } catch (InputMismatchException e) {
          System.out.println("Couldn't parse a number. Please, try again");
          scanner.nextLine();
        }
      }
    }
  }

  private static void print(double[] res) {
    for (double number : res) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}
