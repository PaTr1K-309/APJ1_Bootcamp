package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество пользователей: ");
        int countUsers = readInt(scanner); // Считываем количество пользователей

        List<User> users = new ArrayList<>();

        for (int i = 0; i < countUsers; i++) {
            System.out.println("\nПользователь №" + (i + 1));

            System.out.print("Имя: ");
            String name = scanner.next();

            int age = readValidAge(scanner);

            if (age > 0) { // Если возраст корректен, добавляем пользователя
                users.add(new User(name, age));
            }
        }

        // Выводим имена всех совершеннолетних пользователей (возраст >= 18)
        List<String> adultNames = users.stream()
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println("\nИмена совершеннолетних пользователей:");
        adultNames.forEach(System.out::println);
    }

    /**
     * Метод для безопасного чтения целого числа
     */
    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Не удалось разобрать число. Попробуйте еще раз.");
            }
        }
    }

    /**
     * Метод для проверки возраста
     */
    private static int readValidAge(Scanner scanner) {
        while (true) {
            int age = readInt(scanner);
            if (age > 0) {
                return age;
            } else {
                System.out.println("Некорректный ввод. Возраст <= 0");
            }
        }
    }
}
