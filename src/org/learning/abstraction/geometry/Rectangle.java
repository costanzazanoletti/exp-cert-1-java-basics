package org.learning.abstraction.geometry;

public class Rectangle implements Polygon {

  private final double base, height;

  public Rectangle(double base, double height) throws IllegalArgumentException {
    if (base <= 0 || height <= 0) {
      throw new IllegalArgumentException("base or height <= 0");
    }
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public double getArea() {
    return base * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * base + 2 * height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "base=" + base +
        ", height=" + height +
        '}';
  }
}
