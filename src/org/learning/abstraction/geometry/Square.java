package org.learning.abstraction.geometry;

public class Square extends Rectangle {

  public Square(double side) throws IllegalArgumentException {
    super(side, side);
  }

  @Override
  public String toString() {
    return "Square{side: " + getBase() + "}";
  }
}
