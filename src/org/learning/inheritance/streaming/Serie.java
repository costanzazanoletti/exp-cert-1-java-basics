package org.learning.inheritance.streaming;

public class Serie extends Content {

  private int numberOfEpisodes;

  public Serie(String title) {
    // chiamo il super costruttore con parametri
    super(title);
  }

  public Serie(String title, int numberOfEpisodes) {
    super(title);
    this.numberOfEpisodes = numberOfEpisodes;
  }

  public int getNumberOfEpisodes() {
    return numberOfEpisodes;
  }

  public void setNumberOfEpisodes(int numberOfEpisodes) {
    this.numberOfEpisodes = numberOfEpisodes;
  }

  // ha un metodo play più specifico che tiene conto del numero di episodi
  @Override
  public void play() {
    for (int i = 0; i < numberOfEpisodes; i++) {
      System.out.println(getTitle());
    }
  }
}
