package org.learning.collection;

import java.util.HashSet;
import java.util.Set;

public class Classroom {

  public static void main(String[] args) {

    Set<Student> students = new HashSet<>();
    students.add(new Student("Max", 1));
    students.add(new Student("Will", 2));
    students.add(new Student("Dustin", 3));
    System.out.println(students);

    boolean isPresent = students.contains(new Student("Dustin", 3));
    System.out.println("Is present: " + isPresent);

    boolean isAdded = students.add(new Student("Max", 1));
    System.out.println(isAdded);
    System.out.println(students);

    isAdded = students.add(new Student("Nancy", 4));
    System.out.println(isAdded);
    System.out.println(students);
    System.out.println("---------------");
    for (Student s : students) {
      System.out.println(s);
    }

  }
}
