package org.learning.collection;

import java.util.Comparator;

public class PlayerNameComparator implements Comparator<Player> {

  @Override
  public int compare(Player p1, Player p2) {
    // ritorna  numero < 0 se p1 < p2
    // ritorna 0 se p1 == p2
    // ritorna numero > 0 se p1 > p2
    return p1.getName().compareTo(p2.getName());
  }
}
