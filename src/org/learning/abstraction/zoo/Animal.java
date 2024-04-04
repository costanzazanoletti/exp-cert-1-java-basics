package org.learning.abstraction.zoo;

public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("ZZZzzzz");
  }

  public abstract void makeNoise();


}
