package org.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoGame {

  public static void main(String[] args) {
    List<Player> players = new ArrayList<>();
    players.add(new Player("Will", 100));
    players.add(new Player("Max", 99));
    players.add(new Player("Nancy", 250));
    players.add(new Player("Dustin", 0));


 /*   Player newPlayer = new Player("Max", 0);
    if (players.contains(newPlayer)) {
      System.out.println("This player already exists");
    } else {
      players.add(newPlayer);
    }*/

    System.out.println(players);
    Collections.sort(players,
        Collections.reverseOrder()); // ordina nell'ordine naturale, cioè quello del compateTo
    System.out.println(players);
    // ordina usando il compare della classe PlayerNameComparator
    Collections.sort(players, new PlayerNameComparator());
    System.out.println(players);

    // mappa giocatore - numero partite giocate
    Map<Player, Integer> numberOfGames = new HashMap<>();
    for (Player player : players) {
      numberOfGames.put(player, 0);
    }

    // nancy ha giocato una partita
    Player hasPlayed = new Player("Nancy", 250);
    Integer currentGames = numberOfGames.get(hasPlayed);
    System.out.println("Nancy has played " + currentGames + " games");
    numberOfGames.put(hasPlayed, currentGames + 1);

    System.out.println(numberOfGames);
  }
}
