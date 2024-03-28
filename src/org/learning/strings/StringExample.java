package org.learning.strings;

public class StringExample {

  public static void main(String[] args) {
    String original = "ciao";
    original.toUpperCase();
    String result = original.replaceAll("ci", "b");
    System.out.println(original);
    System.out.println(result);
  }
}
