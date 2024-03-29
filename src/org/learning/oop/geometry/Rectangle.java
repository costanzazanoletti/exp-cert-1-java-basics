package org.learning.oop.geometry;

public class Rectangle {

  // ATTRIBUTI
  private int base;
  private int height;
  // COSTRUTTORI

  public Rectangle(int base, int height) {
    // TO DO Validate
    this.base = base;
    this.height = height;
  }

  // METODI
  public int getArea() {
    return base * height;
  }
}
