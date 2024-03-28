package org.learning.exercises;

import java.util.Locale;
import java.util.Scanner;

public class TrainTicket {

  public static void main(String[] args) {
    // costanti
    final double PRICE_PER_KM = 0.21;
    final int UNDER_AGE = 18;
    final int OVER_AGE = 65;
    final double UNDER_AGE_DISCOUNT = 0.2;
    final double OVER_AGE_DISCOUNT = 0.4;

    Scanner scan = new Scanner(System.in);
    // dichiaro le variabili
    int km, age;
    // Menu testuale
    System.out.println("Welcome to Train Ticket");
    System.out.print("Insert number of km:");
    km = Integer.parseInt(scan.nextLine());
    System.out.print("Insert your age:");
    age = Integer.parseInt(scan.nextLine());

    // calcolo il prezzo base
    double price = km * PRICE_PER_KM;
    System.out.println("Base price: " + price);

    // verifico se devo applicare lo sconto
    if (age < UNDER_AGE) {
      // sconto minorenni
      price -= price * UNDER_AGE_DISCOUNT; // price = price - price*UNDER_AGE_DISCOUNT
    } else if (age >= OVER_AGE) {
      // sconto over 65
      price -= price * OVER_AGE_DISCOUNT;
    }

    String priceString = String.format(Locale.UK, "%.2f", price);
    // stampo il prezzo finale (21, 16.8,12.6)
    System.out.println("Price: " + priceString + "€");

    scan.close();
  }
}
