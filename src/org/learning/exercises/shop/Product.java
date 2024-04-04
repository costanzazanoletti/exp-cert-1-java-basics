package org.learning.exercises.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

  // costante numero massimo del codice
  private static final int MAX_CODE = 100000000;

  // ATTRIBUTI
  private int code;
  private String name;
  private String description;
  private BigDecimal price;
  private BigDecimal vat;

  // COSTRUTTORI

  public Product(String name, String description, BigDecimal price, BigDecimal vat) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vat = vat;
    // genero il codice del prodotto
    this.code = generateCode();
  }

  // GETTER E SETTER
  public BigDecimal getPrice() {
    return price.setScale(2, RoundingMode.HALF_EVEN);
  }

  public BigDecimal getFullPrice() {
    // price + price * vat
    return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
  }

  public String getFullName() {
    return String.format("%08d - %s", code, name);
  }

  public void setPrice(BigDecimal price) {
    if (price == null) {
      // gestisco null value
      price = BigDecimal.ZERO;
    }
    this.price = price;
  }

  public BigDecimal getDiscounterPrice() {
    return getFullPrice().multiply(new BigDecimal("0.2"));
  }

  // METODI
  private int generateCode() {
    // logica: genero un numero random di max 8 cifre
    Random randomGenerator = new Random();
    return randomGenerator.nextInt(MAX_CODE);
  }
}
