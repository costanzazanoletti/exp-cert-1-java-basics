package org.learning.randompicker;


import java.util.Random;

public class RandomStudent {

  public static void main(String[] args) {
    String[] names = {"Giuseppe\tMongelli", "Giulio\tD’Angelo", "Roberto\tBenfini",
        "Salvatore\tBono", "Umberto Maria\tFaenza", "Massimo\tAzzini", "Alessandro\tCingolani",
        "Giuseppe\tGerace", "Alessandro\tMatricardi", "Alessandro\tPirisinu",
        "Salvatore Dario\tTorrisi", "Valerio\tCarbone", "Edoardo\tCicognani", "Gabriel\tD'Amico",
        "Francesco\tCarrara", "Vinicius\tDe Miranda", "Davide\tGila", "Luca\tMasera",
        "Mekki\tOuertani", "Matteo\tPupino", "Alberto\tStizzoli", "Cristian\tUrsino",
        "Luca\tMincuzzi", "Serena\tPeschiaroli"};
    // System.out.println(Arrays.toString(names));

    Random randomGenerator = new Random();
    int randomIndex = randomGenerator.nextInt(names.length);
    // int randomIndex = (int) ((Math.random() * (names.length)));
    System.out.println(names[randomIndex]);

  }
}
