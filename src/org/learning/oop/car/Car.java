package org.learning.oop.car;

import java.time.LocalDate;

public class Car {

  // ATTRIBUTI
  String color;
  String brand;
  String model;
  int year;

  // COSTRUTTORI
  Car() {
    color = "white";
    year = LocalDate.now().getYear();
  }

  Car(String model) {
    this.model = model;
  }

  Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  // METODI
  void start() {
    System.out.println("Vrooom!");
  }

  void changeColor(String newColor) {
    color = newColor;
  }

  int getAge() {
    if (year == 0) {
      return -1;
    }
    // differenza tra anno corrente e anno di immatricolazione
    return LocalDate.now().getYear() - year;
  }

}
