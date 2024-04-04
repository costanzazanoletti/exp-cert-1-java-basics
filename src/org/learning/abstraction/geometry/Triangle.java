package org.learning.abstraction.geometry;

import java.util.Arrays;

public class Triangle implements Polygon {

  private final double[] sides;
  private final double base;
  private final double height;

  public Triangle(double base, double height, double side1, double side2, double side3)
      throws IllegalArgumentException {
    if (base <= 0 || height <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
      throw new IllegalArgumentException("all dimesions must be > 0");
    }
    if (base != side1 && base != side2 && base != side3) {
      throw new IllegalArgumentException("base must be equal to one side");
    }
    this.base = base;
    this.height = height;
    sides = new double[]{side1, side2, side3};
  }

  @Override
  public double getArea() {
    // base*height/2
    return base * height / 2;
  }

  @Override
  public double getPerimeter() {
    // side1 + side2 + side3
    return sides[0] + sides[1] + sides[2];
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "sides=" + Arrays.toString(sides) +
        ", base=" + base +
        ", height=" + height +
        '}';
  }
}
