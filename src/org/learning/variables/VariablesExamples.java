package org.learning.variables;

public class VariablesExamples {

  public static void main(String[] args) {
    int number;
    boolean flag;

    number = 0;

    int result = number + 5;

    String message = "Hello!";
    System.out.println(message);

    byte b = 100;
    short s = 5000;
    long l = 1000000L;
    float f = 5.99F;
    double d = 5.99;
    char c = 'a';

    int length = message.length();
    System.out.println("Hello!" + 11);
    System.out.println(11 + "Hello!");

    int x = 5;

    int y = 2;

    double x1 = x;
    int y1 = (int) x1;

    System.out.println(x + " " + y);
    double z = (double) x / y; // double / int -> divisione double
    int w = (int) z;
    System.out.println("division: " + z);
    System.out.println("cast: " + w);

    int intValue = 100;
    byte byteValue = (byte) intValue;
    System.out.println(byteValue);

    double sum = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
    System.out.println(sum);

  }
}
