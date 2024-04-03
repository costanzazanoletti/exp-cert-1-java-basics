package org.learning.exceptions;

public class Rectangle {

  private int base, height; // devono essere >= 0

  public Rectangle(int base, int height) throws IllegalArgumentException {
    // validazione input
    if (base < 0 || height < 0) {
      throw new IllegalArgumentException("base or height < 0");
    }
    this.base = base;
    this.height = height;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) throws IllegalArgumentException {
    if (base < 0) {
      throw new IllegalArgumentException("base < 0");
    }
    this.base = base;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) throws IllegalArgumentException {
    if (height < 0) {
      throw new IllegalArgumentException("base < 0");
    }
    this.height = height;
  }

  public int getArea() {
    return base * height;
  }
}
