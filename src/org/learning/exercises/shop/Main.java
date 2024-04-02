package org.learning.exercises.shop;

import java.math.BigDecimal;

public class Main {

  private static void printValue(String value) {
    System.out.println(value);
  }

  public static void main(String[] args) {
    Product p = new Product("yogurth", "strawberry yogurth", BigDecimal.valueOf(2.5),
        new BigDecimal("0.18"));

    System.out.println("Price: " + p.getPrice());
    System.out.println("Full price: " + p.getFullPrice());
    p.setPrice(new BigDecimal("3.5"));
    System.out.println(p.getFullName());
    System.out.println("Price: " + p.getPrice());
    System.out.println("Full price: " + p.getFullPrice());
    printValue(p.getFullName());


  }
}
