package org.learning.collection;

public class Player implements Comparable<Player> {

  private String name;
  private int score;

  public Player(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", score=" + score +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Player player = (Player) o;
    // verifico solo se hanno nome uguale
    return getName().equals(player.getName());
  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public int compareTo(Player otherPlayer) {
    // ritorna  numero < 0 se this < otherPlayer
    // ritorna 0 se this == otherPlayer
    // ritorna numero > 0 se this > otherPlayer
    return this.getScore() - otherPlayer.getScore();
  }
}
