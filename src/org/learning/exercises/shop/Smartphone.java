package org.learning.exercises.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

  private String imei;

  public Smartphone(String name, String description, BigDecimal price,
      BigDecimal vat, String imei) {
    super(name, description, price, vat);
    this.imei = imei;
  }

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }
}
