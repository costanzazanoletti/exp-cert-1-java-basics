package org.learning.inheritance.streaming;

public class Content {

  private final String title;

  public Content(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void play() {
    System.out.println("Playing..." + title);
  }

  @Override
  public String toString() {
    return "Content{" +
        "title='" + title + '\'' +
        '}';
  }
}
