package org.learning.media;

public class Image extends Media implements BrightLevel {

  // ATTRIBUTI
  private double brigthnessLevel;

  // COSTRUTTORI
  public Image(String title) throws IllegalArgumentException {
    super(title);
    brigthnessLevel = DEFAULT_BRIGHTNESS;
  }

  // METODI
  @Override
  public void darker() {
    if (brigthnessLevel > MIN_BRIGHTNESS) {
      brigthnessLevel -= 0.1;
    }
  }

  @Override
  public void lighter() {
    if (brigthnessLevel < MAX_BRIGHTNESS) {
      brigthnessLevel += 0.1;
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current image brightness: " + brigthnessLevel);
  }

  @Override
  public void execute() {
    show();
  }

  public void show() {
    System.out.print(getTitle());
    for (double i = 0; i < brigthnessLevel; i += 0.1) {
      System.out.print("*");
    }
    System.out.println();
  }
}
