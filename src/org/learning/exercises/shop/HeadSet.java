package org.learning.exercises.shop;

import java.math.BigDecimal;

public class HeadSet extends Product {

  private String color;

  public HeadSet(String name, String description, BigDecimal price,
      BigDecimal vat, String color) {
    super(name, description, price, vat);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
