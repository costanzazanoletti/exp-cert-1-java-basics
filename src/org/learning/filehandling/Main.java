package org.learning.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    File root = new File("./resources/data.txt");
    System.out.println(root.exists());
    System.out.println(root.isDirectory());
    System.out.println(root.getAbsolutePath());
    if (root.isDirectory()) {
      String[] files = root.list();
      for (String fileName : files) {
        System.out.println(fileName);
      }
    }
    // scrivo il contenuto del file
    boolean exit = false;
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(root);
      for (int i = 0; i < 10; i++) {
        fileWriter.write(i + "\n");
      }
    } catch (IOException e) {
      System.out.println("Unable to open file");
      exit = true;
    } finally {
      if (fileWriter != null) {
        try {
          fileWriter.close();
        } catch (IOException e) {
          System.out.println("Unable to close file");
        }
      }
    }
    if (!exit) {
      // leggo il contenuto del file
      Scanner fileReader = null;
      try {
        fileReader = new Scanner(root);
        while (fileReader.hasNextLine()) {
          String line = fileReader.nextLine();
          System.out.println(line);
        }
      } catch (FileNotFoundException e) {
        System.out.println("File not found");
      } finally {
        if (fileReader != null) {
          fileReader.close();
        }
      }
    }
  }
}
