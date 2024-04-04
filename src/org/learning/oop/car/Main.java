package org.learning.oop.car;

public class Main {

  public static void main(String[] args) {
    Car myCar = new Car();
    Car otherCar = new Car("Audi", "A4");

    myCar.start();
    otherCar.start();

    int myCarAge = myCar.getAge();
    System.out.println("age: " + myCarAge);

    System.out.println(myCar.brand);
    System.out.println(myCar.model);
    System.out.println(myCar.year);

    myCar.brand = "Toyota";
    myCar.model = "Yaris";
    myCar.year = 2021;

    System.out.println("age: " + myCar.getAge());
    System.out.println(myCar.brand);
    System.out.println(myCar.model);
    System.out.println(myCar.year);

  }
}
