package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    boolean check = false;
    do {
      try {
        n = scanner.nextInt();
        if (n <= 0) {
          throw new InputMismatchException();
        }
        check = true;
      } catch (InputMismatchException e) {
        System.out.println("Couldn't parse a number. Please, try again");
        scanner.nextLine();
      }
    } while (!check);
    try {
      int fibonacciNumder = fibonacci(n);
      System.out.println(fibonacciNumder);
    } catch (ArithmeticException | StackOverflowError e) {
      System.out.println("Too large n");
    }
    scanner.close();
  }

  private static int fibonacci(int n) throws ArithmeticException {
    if (n == 1 || n == 2) {
      return 1;
    }
    int previous = fibonacci(n - 1);
    int beforePrevious = fibonacci(n - 2);
    int res = previous + beforePrevious;
    if (res < previous) {
      throw new ArithmeticException("");
    }
    return res;
  }
}