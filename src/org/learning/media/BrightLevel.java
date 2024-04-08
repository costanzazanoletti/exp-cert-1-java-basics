package org.learning.media;

public interface BrightLevel {

  double DEFAULT_BRIGHTNESS = 0.5;
  double MIN_BRIGHTNESS = 0.0;
  double MAX_BRIGHTNESS = 0.9;

  void darker();

  void lighter();

  void printBrightness();
}
