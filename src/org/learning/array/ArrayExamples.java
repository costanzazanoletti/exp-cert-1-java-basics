package org.learning.array;

import java.util.Arrays;

public class ArrayExamples {

  public static void main(String[] args) {
    int[] numbers = {5, 8, 7, 6};
    System.out.println(Arrays.toString(numbers));
    double[] doubles = new double[5];
    System.out.println(Arrays.toString(doubles));
    String[] strings = new String[5];
    System.out.println(Arrays.toString(strings));

    byte b = 10;
    numbers[0] = b;

  }
}
