package org.learning.loop;

import java.util.Scanner;

public class LinearSearchWhile {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = {29, 55, 3, 21, 100, 99};
    System.out.println("Insert a number: ");
    int search = Integer.parseInt(scan.nextLine());

    boolean found = false;
    int i = 0;

    while (!found && i < numbers.length) {
      if (search == numbers[i]) {
        found = true;
      }
      i++;
    }

    if (found) {
      System.out.println("Found!");
    } else {
      System.out.println("Not found");
    }

    scan.close();
  }


}
