package org.learning.abstraction.zoo;

public class Baloon implements CanFly {

  private String color;

  public Baloon(String color) {
    this.color = color;
  }

  @Override
  public void fly() {
    System.out.println("I'ma a " + color + " baloon and I fly");
  }
}
