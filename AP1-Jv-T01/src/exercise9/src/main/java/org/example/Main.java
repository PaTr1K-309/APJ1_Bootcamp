package org.example;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeLine = 0;
        String userLine = "";
        boolean check = false;

        while (!check) {
            try {
                sizeLine = scanner.nextInt();
                scanner.nextLine();
                check = true;
            } catch (InputMismatchException e) {
                continue;
            }

        List<String> allLine = new ArrayList<>(sizeLine);

            for (int i = 0; i < sizeLine; i++) {
                String line = scanner.nextLine();
                allLine.add(line);
            }

            userLine = scanner.nextLine();
            List<String>result = isEmptyList(allLine, userLine);

            if(!result.isEmpty()) {
                boolean first = true;
                for(String line : result) {
                    if(!first){
                        System.out.print(", ");
                    } else {
                        first = false;
                    }
                    System.out.print(line);
                }
            }
        }
    }
    private static List<String> isEmptyList(List<String> allLine, String userInput) {
            List<String> result = new ArrayList<>();
        for (String str : allLine) {
            if(str.contains(userInput)) {
                result.add(str);
            }
        }
        return result;
    }
}