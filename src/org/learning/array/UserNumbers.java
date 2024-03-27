package org.learning.array;

import java.util.Arrays;
import java.util.Scanner;

public class UserNumbers {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // chiediamo all'utente di dirci quanti numeri ci vuole dare
    System.out.print("How many numbers? ");
    int size = Integer.parseInt(scan.nextLine());
    // creo l'array che conterrà i numeri
    int[] numbers = new int[size];
    System.out.println(Arrays.toString(numbers));
    // chiediamogli di darci tutti quei numeri e li mettiamo in un array

    for (int i = 0; i < numbers.length; i++) {
      //System.out.println(i);
      // chiedo all'utente che numero vuole mettere a questa posizione
      System.out.print("Which number at position " + (i + 1) + "?");
      numbers[i] = Integer.parseInt(scan.nextLine());
    }

    System.out.println(Arrays.toString(numbers));
    scan.close();
  }
}
