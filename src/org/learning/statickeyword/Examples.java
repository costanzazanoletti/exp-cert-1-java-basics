package org.learning.statickeyword;

import java.time.LocalDate;

public class Examples {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now(); // metodo static
    today.getYear(); // metodo di istanza
  }
}
