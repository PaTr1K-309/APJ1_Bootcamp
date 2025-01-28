package org.example;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int sec = 0;
    String formattedTime = "";
    sec = InPud();
    formattedTime = calculatorTime(sec);
    OutPud(formattedTime);
  }
  private static int InPud() {
    Scanner scanner = new Scanner(System.in);
    int sec = 0;
    boolean CheckInpud = false;
    do {
      try {
        sec = scanner.nextInt();
        if (sec <= 0) {
          System.out.println("Incorrect time");
        } else {
          CheckInpud = true;
        }
      } catch (InputMismatchException e) {
        System.out.println("Couldn't parse a number. Please, try again");
        scanner.nextLine();
      }
    } while (!CheckInpud);
    scanner.close();
    return sec;
  }

  private static void OutPud(String formattedTime) {
    System.out.println(formattedTime);
  }

  private static String calculatorTime(int sec) {
    LocalTime time = LocalTime.MIDNIGHT.plusSeconds(sec);
    return String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
  }
}
