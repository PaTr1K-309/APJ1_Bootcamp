package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String filePath = scanner.nextLine();

    // Проверка существования файла
    File file = new File(filePath);
    if (!file.exists()) {
      System.out.println("Input error. File isn't exist");
      return;
    }

    // Чтение содержимого файла
    List<String> allLines = Files.readAllLines(Paths.get(filePath));

    // Объединение всех строк в одну длинную строку
    String combinedText = String.join(" ", allLines);

    // Разбиение объединённой строки на отдельные числа
    String[] parts = combinedText.split("\\s+"); // Разделение по одному или нескольким пробелам

    // Чтение первой строки как количества чисел
    // Сделать, что первое число ???
    int countNumbers = 0;
    try {
      countNumbers = Integer.parseInt(parts[0]);
    } catch (NumberFormatException e) {
      System.out.println("Invalid format of array size");
      return;
    }

    if (countNumbers <= 0) {
      System.out.println("Input error. Size <= 0");
      return;
    }

    // Чтение чисел из файла
    List<Double> numbers = new ArrayList<>();
    for (int i = 1; i < parts.length; i++) {
      try {
        double number = Double.parseDouble(parts[i]);
        numbers.add(number);
        if (numbers.size() >= countNumbers) {
          break; // Прерывание цикла, если достигли нужного количества чисел
        }
      } catch (NumberFormatException e) {
        continue; // Пропускаем некорректные строки
      }
    }

    // Проверка, что было прочитано достаточное количество чисел
    if (numbers.size() != countNumbers) {
      System.out.println("Input error. Insufficient number of elements");
      return;
    }

    // Поиск минимума и максимума
    double minNumber = Double.MAX_VALUE;
    double maxNumber = Double.MIN_VALUE;
    for (double number : numbers) {
      if (number < minNumber) {
        minNumber = number;
      }
      if (number > maxNumber) {
        maxNumber = number;
      }
    }

    // Запись результата в файл
    File resultFile = new File("TestFile/result.txt"); // Куда записывать src или куда???
    PrintWriter writer = new PrintWriter(resultFile);
    writer.println(minNumber + " " + maxNumber);
    writer.close();

    // Сообщение о сохранении
    // Вывод количества и самих чисел
    System.out.println(countNumbers);
    for (double num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println("\nSaving min and max values in file");
  }
}
