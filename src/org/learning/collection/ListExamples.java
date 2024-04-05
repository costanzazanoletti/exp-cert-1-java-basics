package org.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListExamples {

  public static void main(String[] args) {
    // chiedo all'utente di continuare a inserire numeri fino a che decide stop
    Scanner scan = new Scanner(System.in);

    List<Integer> numbers = new ArrayList<>();
    System.out.println(numbers);
    boolean exit = false;
    while (!exit) {
      System.out.print("Insert a number?y/n: ");
      String choice = scan.nextLine();
      switch (choice.toUpperCase()) {
        case "Y":
          // inserisce un numero
          System.out.print("Number: ");
          int number = Integer.parseInt(scan.nextLine());
          // aggiungo il numero alla lista
          numbers.add(number);
          break;
        case "N":
          // esce
          exit = true;
          break;
        default:
          // invalid choice
          System.out.println("Invalid choice");
          break;
      }
    }
    if (numbers.isEmpty()) {
      System.out.println("Your list is empty");
    } else {
      System.out.println("You added " + numbers.size() + " numbers");
      //System.out.println(numbers);
      /*for (Integer i : numbers) {
        System.out.println(i);
      }*/
     /* for (int i = numbers.size() - 1; i >= 0; i--) {
        System.out.println(numbers.get(i));
      }*/

      Iterator<Integer> iterator = numbers.iterator();
      while (iterator.hasNext()) {
        Integer current = iterator.next();
        System.out.println(current);
      }

    }

    // verifico se la lista contiene un certo numero
    int search = 100;
    boolean isPresent = numbers.contains(search);
    System.out.println(isPresent ? "100 is present" : "100 not present");

    System.out.println("-------------");
    // ordino la lista di numeri
    Collections.sort(numbers);
    System.out.println(numbers);
    Collections.shuffle(numbers);
    System.out.println(numbers);

    scan.close();
  }
}
