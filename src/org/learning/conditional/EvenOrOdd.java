package org.learning.conditional;

import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String[] args) {
    // inizializzo lo Scanner
    Scanner scan = new Scanner(System.in);
    // chiedo un numero all'utente
    System.out.print("Insert a number: ");
    int number = scan.nextInt();
    // stampo a video se è pari o dispari
    if (number % 2 == 0) { // o true o false
      // pari
      System.out.println("The number is even");
    } else {
      // dispari
      System.out.println("The number is odd");
    }

    // chiudo lo Scanner
    scan.close();
  }
}
