package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class User {
    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    public int size;

    private List<String> listName = new ArrayList<>();
    private List<Integer> listAge = new ArrayList<>();

    public User() {
        this.name = "";
        this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputSize() {
        boolean checkSize = true;
        while (checkSize) {
            try {
                size = scanner.nextInt();
                checkSize = false;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
    }

    public void inputName() {
        name = scanner.nextLine().trim();
        listName.add(name);
    }

    public void inputAge() {
        while (true) {
            try {
                age = scanner.nextInt();
                listAge.add(age);
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.nextLine();
            }
        }
    }

    public void addUser() {
        inputName();
        inputAge();
    }

    public void printUsers() {
        boolean first = true;
        for (int i : listAge) {
            if (i <= 0) {
                System.out.println("Incorrect input. Age <= 0");
            }
        }
        for (int i = 0; i < size; i++) {
            if (listAge.get(i) >= 18) {
            if(!first) {
                System.out.print(", ");
            } else {
                first = false;
            }
                System.out.print(listName.get(i));
            }
        }
    }
}