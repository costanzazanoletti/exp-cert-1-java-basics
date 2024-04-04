package org.learning.exercises.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Catalog {

  private final static String FILE_PATH = "./resources/books.txt";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // creo l'array di libri
    System.out.print("How many books? ");
    int size = Integer.parseInt(scan.nextLine());
    Book[] books = new Book[size];

    // per ogni posizione chiedo i dati e creo un libro
    for (int i = 0; i < books.length; i++) {
      books[i] = createBook(scan);
    }
    scan.close();
    // scrivo i dati su file
    boolean written = writeToFile(books);
    // leggo il file
    if (written) {
      readFile();
    }
  }


  private static Book createBook(Scanner scan) {
    Book book = null;

    do {
      try {
        System.out.print("Title: ");
        String title = scan.nextLine();
        System.out.print("Authors: ");
        String authors = scan.nextLine();
        System.out.print("Publisher: ");
        String publisher = scan.nextLine();
        System.out.print("Number of pages: ");
        int numberOfPages = Integer.parseInt(scan.nextLine());
        book = new Book(title, authors, publisher, numberOfPages);
      } catch (NumberFormatException e) {
        System.out.println("Invalid number");
      } catch (BookIllegalParameterException exc) {
        System.out.println("Invalid book parameter: " + exc.getMessage());
      }
    } while (book == null);

    return book;
  }


  private static boolean writeToFile(Book[] books) {
    File bookFile = new File(FILE_PATH);
    boolean written = false;
    try (FileWriter writer = new FileWriter(bookFile)) {
      for (Book book : books) {
        writer.write(book.toString() + "\n");
      }
      written = true;
    } catch (IOException e) {
      System.out.println("Unable to write file");

    }
    return written;
  }

  private static void readFile() {
    try (Scanner reader = new Scanner(new File(FILE_PATH))) {
      while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Unable to read file");
    }
  }
}
