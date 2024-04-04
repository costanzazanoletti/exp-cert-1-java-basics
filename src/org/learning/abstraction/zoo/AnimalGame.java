package org.learning.abstraction.zoo;

public class AnimalGame {

  public static void main(String[] args) {
    CanFly donald = new Duck("Donald");
    //Animal animal = new Animal("generic animal");
    // animal.makeNoise();
    Animal[] animals = {new Cat("Tom"), new Cow("Lucy"), (Duck) donald};
    for (Animal animal : animals) {
      System.out.println(animal.getName());
      animal.makeNoise();
      animal.sleep();
      if (animal instanceof CanFly) {
        ((CanFly) animal).fly();
      }
    }
  }
}
