package org.learning.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TemperatureMap {

  public static void main(String[] args) {
    Map<String, Double> temperatures = new HashMap<>();
    temperatures.put("Mon", 15.8);
    temperatures.put("Tue", 15.8);
    temperatures.put("Wen", 10.5);
    temperatures.put("Thu", 18.8);
    temperatures.put("Fri", 9.6);
    temperatures.put("Sat", 15.0);
    temperatures.put("Sun", 17.8);

    System.out.println(temperatures);

    temperatures.put("Wen", 20.0);
    System.out.println(temperatures);

    if (!temperatures.containsKey("Wen")) {
      temperatures.put("Wen", 40.0);
    }
    System.out.println(temperatures);

    System.out.println("Is present 15.0: " + temperatures.containsValue(15.0));

    // mi faccio dare il keyset
    Set<String> keys = temperatures.keySet();
    // mi faccio dare l'iterator su keyset
    Iterator<String> iter = keys.iterator();
    // itero sul keyset
    while (iter.hasNext()) {
      String day = iter.next();
      // per ogni key mi faccio dare il value corrispondente
      Double temp = temperatures.get(day);
      System.out.println(day + ": " + temp);
    }


  }
}
