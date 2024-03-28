package org.learning.loop;

import java.util.Scanner;

public class LinearSearchEnhancedFor {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = {29, 55, 3, 21, 100, 99};
    System.out.println("Insert a number: ");
    int search = Integer.parseInt(scan.nextLine());

    boolean found = false;

    for (int current : numbers) {
      // current
      if (current == search) {
        found = true;
        break;
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
