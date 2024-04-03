package org.learning.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    // try-with-resources: non serve finally perchè tutte le risorse aperte nelle parentesi tonde vengono
    // chiuse automaticamente al termine del blocco try-catch
    try (Scanner fileReader = new Scanner(new File("./resources/data.txt"))) {
      while (fileReader.hasNextLine()) {
        System.out.println(fileReader.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}
