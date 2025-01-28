/*
* Немного не точное
* при вводе неправильного возраста нужно пропустить, но не заносить в моссив
* */
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        user.inputSize();
        for (int i = 0; i < user.size; i++) {
            user.inputName();
            user.inputAge();
        }
        user.printUsers();
    }
}
