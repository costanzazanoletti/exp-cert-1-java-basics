package org.learning.media;

public class Audio extends Media implements Playable, VolumeLevel {

  // COSTANTI
  private final static int DEFAULT_VOLUME = 5;
  private final static int MAX_VOLUME = 10;
  private final static int MIN_VOLUME = 0;
  // ATTRIBUTI
  private int volume;

  // COSTRUTTORI
  public Audio(String title) throws IllegalArgumentException {
    super(title);
    volume = DEFAULT_VOLUME;
  }

  // METODI

  public int getVolume() {
    return volume;
  }

  @Override
  public void execute() {
    // audio è riproducibile e richiama il metodo play
    play();
  }

  @Override
  public void play() {
    for (int i = 0; i < volume; i++) {
      System.out.print(getTitle());
    }
    System.out.println();
  }

  @Override
  public void louder() {
    if (volume < MAX_VOLUME) {
      volume++; // volume = volume + 1
    }
  }

  @Override
  public void weaker() {
    if (volume > MIN_VOLUME) {
      volume--;
    }
  }

  @Override
  public void printVolume() {
    System.out.println("Current volume: " + volume);
  }
}
