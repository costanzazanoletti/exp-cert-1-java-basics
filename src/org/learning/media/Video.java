package org.learning.media;

public class Video extends Audio implements BrightLevel {

  // ATTRIBUTI
  private double brightness;

  // COSTRUTTORI
  public Video(String title) throws IllegalArgumentException {
    super(title); // deve essere la prima istruzione
    brightness = DEFAULT_BRIGHTNESS;
  }

  // METODI

  @Override
  public void darker() {
    if (brightness > MIN_BRIGHTNESS) {
      brightness -= 0.1;
    }
  }

  @Override
  public void lighter() {
    if (brightness < MAX_BRIGHTNESS) {
      brightness += 0.1;
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current video brightness: " + brightness);
  }

  @Override
  public void play() {
    for (int i = 0; i < getVolume(); i++) {
      System.out.print(getTitle());
      for (double j = 0.0; j < brightness; j += 0.1) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
