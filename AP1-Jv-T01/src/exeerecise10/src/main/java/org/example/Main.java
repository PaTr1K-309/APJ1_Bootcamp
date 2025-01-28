package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countUsers = readInt(scanner); 
        List<User> users = new ArrayList<>();

        for (int i = 0; i < countUsers; i++) {
            String name = scanner.next();

            int age = readValidAge(scanner);

            if (age > 0) {
                users.add(new User(name, age));
            }
        }
        List<String> adultNames = users.stream()
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .toList();
        adultNames.forEach(System.out::println);
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again.");
            }
        }
    }

    private static int readValidAge(Scanner scanner) {
        while (true) {
            int age = readInt(scanner);
            if (age > 0) {
                return age;
            } else {
                System.out.println("Incorrect input. Age <= 0");
            }
        }
    }
}
