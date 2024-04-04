package org.learning.abstraction.zoo;

public class Cow extends Animal {

  public Cow(String name) {
    super(name);
  }

  public void makeNoise() {
    System.out.println("Mooooh");
  }
}
