package org.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStrings {

  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "goodbye";
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
    System.out.println(s1.compareTo("Hello"));

    List<String> words = new ArrayList<>();
    words.add(s1);
    words.add(s2);
    System.out.println(words);
    Collections.sort(words);
    System.out.println(words);
    Collections.sort(words, Collections.reverseOrder());
    System.out.println(words);

  }
}
