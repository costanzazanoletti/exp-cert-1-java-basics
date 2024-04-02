package org.learning.exercises.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Cart {

  // chiedo all'utente quanti prodotti vuole inserire e li aggiungo al carrello poi calcolo il totale
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many products? ");
    int size = Integer.parseInt(scan.nextLine());
    // creo l'array cart
    Product[] cart = new Product[size];
    // itero sull'array vuoto e ad ogni posizione ci metto un nuovo Product
    for (int i = 0; i < cart.length; i++) {
      System.out.println("Product " + (i + 1));
      System.out.print("Name: ");
      String name = scan.nextLine();
      System.out.print("Description: ");
      String description = scan.nextLine();
      System.out.print("Price: ");
      String priceString = scan.nextLine().replaceAll(",", ".");
      System.out.print("Vat: ");
      String vatString = scan.nextLine().replaceAll(",", ".");
      // creo un'istanza di Product con i valori dell'utente
      Product product = new Product(name, description, new BigDecimal(priceString),
          new BigDecimal(vatString));
      // aggiungo il prodotto all'array carrello
      cart[i] = product;
    }

    BigDecimal total = BigDecimal.ZERO;
    // stampo lo scontrino e calcolo il totale incrementale
    for (Product p : cart) {
      System.out.println(p.getFullName() + "\t" + p.getFullPrice() + "€");
      // total += price
      total = total.add(p.getFullPrice());
    }
    // stampo il totale
    System.out.println("----------------------");
    System.out.println("Total: " + total.setScale(2, RoundingMode.HALF_EVEN) + "€");
    scan.close();
  }
}
