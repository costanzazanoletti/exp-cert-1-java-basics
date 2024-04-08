package org.learning.media;

import java.util.Scanner;

public class Playlist {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // creo un array di 5 elementi multimediali
    // Media[] playlist = createPlaylist(scan);
    Media[] playlist = {new Image("Portrait"), new Video("Java lesson"), new Audio("White noise")};
    // chiedo quale elemento eseguire
    int element;
    do {
      System.out.print("Which element? (1-5) - 0 to exit");
      element = Integer.parseInt(scan.nextLine());
      if (element != 0) {
        try {
          playlist[element - 1].execute();
          // richiamo i controlli

        } catch (IndexOutOfBoundsException e) {
          System.out.println("Invalid index: 1-5");
        }
      } else {
        System.out.println("Goodbye");
      }
    } while (element != 0);

    scan.close();
  }

  private static Media[] createPlaylist(Scanner scan) {
    Media[] playlist = new Media[5];
    for (int i = 0; i < playlist.length; i++) {
      System.out.print("Type: 1-Audio 2-Video 3-Image ");
      String choice = scan.nextLine();
      while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
        System.out.println("Invalid choice");
        System.out.print("Type: 1-Audio 2-Video 3-Image ");
        choice = scan.nextLine();
      }
      System.out.println("Title: ");
      String title = scan.nextLine();
      while (title.isEmpty()) {
        System.out.println("Title must not be empty");
        System.out.print("Title: ");
        title = scan.nextLine();
      }
      switch (choice) {
        case "1":
          // Audio
          playlist[i] = new Audio(title);
          break;
        case "2":
          // Video
          playlist[i] = new Video(title);
          break;
        case "3":
          // Image
          playlist[i] = new Image(title);
          break;
        default:
          break;
      }
    }
    return playlist;
  }
}
