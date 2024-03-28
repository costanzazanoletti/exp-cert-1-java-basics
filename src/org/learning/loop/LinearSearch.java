package org.learning.loop;

import java.util.Scanner;

public class LinearSearch {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = {29, 55, 3, 21, 100, 99};
    System.out.println("Insert a number: ");
    int search = Integer.parseInt(scan.nextLine());

    // variabile di appoggio booleana
    boolean found = false;
    for (int i = 0; i < numbers.length && !found; i++) {
      if (numbers[i] == search) {
        // found!
        found = true;
      }
    }

    if (found) {
      System.out.println("Found!");
    } else {
      System.out.println("Not found");
    }

    scan.close();
  }


}
