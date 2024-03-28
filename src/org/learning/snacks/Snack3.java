package org.learning.snacks;

import java.util.Scanner;

/*
 * data una stringa inserita dall’utente contare quante volte appare il carattere ‘a’ (minuscolo o maiuscolo)
 * */
public class Snack3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insert a word: ");
    String word = scan.nextLine();
    int occurrences = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
        occurrences++;
      }
    }
    System.out.println("Occurrences of a/A: " + occurrences);
    scan.close();
  }
}
