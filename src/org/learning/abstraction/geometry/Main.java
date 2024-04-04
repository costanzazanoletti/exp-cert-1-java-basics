package org.learning.abstraction.geometry;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5.6, 9.4);
    Triangle triangle = new Triangle(10.0, 5.0, 10.0, 8.0, 7.0);
    Square square = new Square(9.9);
    double totalArea = totalArea(new Polygon[]{rectangle, triangle, square});
    System.out.println(rectangle);
    System.out.println(triangle);
    System.out.println(square);
    System.out.println("Total area: " + totalArea);
  }

  private static double totalArea(Polygon[] polygons) {
    double sum = 0.0;
    for (Polygon polygon : polygons) {
      sum += polygon.getArea();
    }
    return sum;
  }
}
