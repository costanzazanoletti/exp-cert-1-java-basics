package org.learning.abstraction.zoo;

public class Duck extends Animal implements CanFly {

  public Duck(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm a duck and I fly");
  }
}
