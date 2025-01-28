package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                int n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("Input error. Size <= 0");
                        continue;
                    }
                int[] masiv = new int[n];
                for (int i = 0; i < n; i++) {
                    masiv[i] = scanner.nextInt();
                }
                arithmeticMean(masiv);
                check = true;
            } catch (InputMismatchException e){
                System.out.println("Couldn't parse a number. Please, try again");
            }
            scanner.nextLine();
        } while (!check);
    }

    private static void arithmeticMean(int[] masiv) {
        int sumOfNegatives = 0;
        int countOfNegatives = 0;

        for (int element : masiv) {
            if (element < 0) {
                sumOfNegatives += element;
                countOfNegatives++;
            }
        }
        if (countOfNegatives > 0) {
            int res = sumOfNegatives / countOfNegatives;
            System.out.println(res);
        } else {
            System.out.println("There are no negative elements");
        }
    }
}