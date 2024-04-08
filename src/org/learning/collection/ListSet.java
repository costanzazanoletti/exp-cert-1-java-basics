package org.learning.collection;

import java.util.HashSet;
import java.util.Set;

public class ListSet {

  public static void main(String[] args) {
    //List<String> words = new ArrayList<>();
    Set<String> words = new HashSet<>();
    System.out.println(words.add("ciao") ? "added" : "not added");
    System.out.println(words.add("arrivederci") ? "added" : "not added");
    System.out.println(words.add("ciao") ? "added" : "not added");

    boolean isPresent = words.contains(
        "hola"); // per ogni stringa chiamo "hola".equals(elementoCorrente)
    System.out.println(isPresent);

    System.out.println(words);
  }
}
