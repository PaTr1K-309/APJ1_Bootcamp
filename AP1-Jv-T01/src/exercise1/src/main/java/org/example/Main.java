package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  private static final int PRECISION = 1000; // Для округления до 3 знаков после запятой

  public static void main(String[] args) {
    double aX, bX, cX;
    double aY, bY, cY;
    double A, B, C;
    Scanner scanner = new Scanner(System.in);
    boolean CheckInpud = false;
    do {
      try {
        aX = scanner.nextDouble();
        aY = scanner.nextDouble();
        bX = scanner.nextDouble();
        bY = scanner.nextDouble();
        cX = scanner.nextDouble();
        cY = scanner.nextDouble();

        A = ccoordinateСalculator(aX, bX, aY, bY);
        B = ccoordinateСalculator(bX, cX, bY, cY);
        C = ccoordinateСalculator(aX, cX, aY, cY);

        if (!CheckTR(A, B, C)) {
          System.out.println("It isn't triangle");
          continue;
        }

        double perimeter = ((A + B + C) * PRECISION / (double) PRECISION);
        System.out.printf("Perimeter: %.3f", perimeter);
        CheckInpud = true;
      } catch (InputMismatchException e) {
        System.out.println("Couldn't parse a number. Please, try again");
        scanner.nextLine();
      }
    } while (!CheckInpud);
    scanner.close();
  }

  private static double ccoordinateСalculator(double x1, double x2, double y1, double y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  private static boolean CheckTR(double A, double B, double C) {
    return A + B > C && A + C > B && B + C > A;
  }
}
