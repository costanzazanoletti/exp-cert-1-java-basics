package org.learning.exceptions;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean flag = false;
    do {
      System.out.println("Insert a number");

      try {
        int number = Integer.parseInt(scan.nextLine());
        System.out.println("You number is " + number);
        flag = true;
      } catch (NumberFormatException e) {
        System.out.println("Invalid number. Try again.");
        e.printStackTrace();
      } finally {
        System.out.println("End of try-catch");
        
      }
    } while (!flag);
    scan.close();

  }
}
