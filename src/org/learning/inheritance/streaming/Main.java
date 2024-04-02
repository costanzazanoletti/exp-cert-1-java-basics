package org.learning.inheritance.streaming;

public class Main {

  public static void main(String[] args) {
    Content content = new Content("New Content");
    content.play();

    Serie squidGame = new Serie("Squid Game", 10);
    squidGame.play();
    squidGame.setNumberOfEpisodes(10);
    System.out.println(squidGame.getNumberOfEpisodes());
    System.out.println("***************");
    Content[] playlist = new Content[]{content, squidGame};
    for (Content c : playlist) {
      c.play();
    }
  }
}
