package org.learning.snacks;

import java.util.Arrays;

/*
 * dato un array di stringhe, trasformate tutti gli elementi dell’array in upper case:
 * si deve fare con un unico ciclo for sull’array.
 * */
public class Snack1 {

  public static void main(String[] args) {
    String[] names = {"Max", "will", "dustin", "Nancy"};
    System.out.println(Arrays.toString(names));

    for (int i = 0; i < names.length; i++) {
      names[i] = names[i].toUpperCase();
    }
    System.out.println(Arrays.toString(names));
  }
}
