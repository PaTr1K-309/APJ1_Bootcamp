package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> pets = new ArrayList<>();
        int sizeAnimal;

        // Запрашиваем количество животных
        while (true) {
            try {
                sizeAnimal = Integer.parseInt(scanner.nextLine().trim());
                if (sizeAnimal <= 0) {
                    System.out.println("Incorrect input. Number of pets must be > 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Couldn't parse a number. Please, try again.");
            }
        }

        // Ввод данных о животных
        for (int i = 0; i < sizeAnimal; i++) {
            String animal = scanner.nextLine().trim().toLowerCase();
            if (!animal.equals("dog") && !animal.equals("cat")) {
                System.out.println("Incorrect input. Unsupported pet type");
                continue; // Пропускаем некорректный ввод типа животного
            }

            String name = scanner.nextLine().trim();

            int age;
            try {
                age = Integer.parseInt(scanner.nextLine().trim());
                if (age <= 0) {
                    System.out.println("Incorrect input. Age <= 0");
                    continue; // Пропускаем это животное без добавления
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Age <= 0");
                continue;
            }

            double mass;
            try {
                mass = Double.parseDouble(scanner.nextLine().trim());
                if (mass <= 0) {
                    System.out.println("Incorrect input. Mass <= 0");
                    continue; // Пропускаем это животное без добавления
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Mass <= 0");
                continue;
            }

            // Если все данные корректны, добавляем животное в список
            if (animal.equals("dog")) {
                pets.add(new Dog(name, age, mass));
            } else {
                pets.add(new Cat(name, age, mass));
            }
        }

        // Вывод списка животных
        for (Animal pet : pets) {
            System.out.println(pet);
        }

        scanner.close();
    }
}
