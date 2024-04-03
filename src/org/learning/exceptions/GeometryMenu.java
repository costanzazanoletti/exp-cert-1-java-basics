package org.learning.exceptions;

import java.util.Scanner;

public class GeometryMenu {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {
      System.out.print("Insert base:");
      int base = Integer.parseInt(scan.nextLine());
      System.out.print("Insert height:");
      int height = Integer.parseInt(scan.nextLine());
      Rectangle rectangle = new Rectangle(base, height);
      System.out.println(rectangle.getArea());
    } catch (NumberFormatException e) {
      // gestisco errori di input non numerico
      System.out.println("The input is not a number");
    } catch (IllegalArgumentException e) {
      // gestisco base o altezza negative
      System.out.println("Cannot create a Rectangle: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Generic error");
    }

    scan.close();
  }
}
