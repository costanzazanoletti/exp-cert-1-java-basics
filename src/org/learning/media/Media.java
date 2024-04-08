package org.learning.media;

public abstract class Media {

  private String title;

  public Media(String title) throws IllegalArgumentException {
    if (title == null || title.isEmpty()) {
      throw new IllegalArgumentException("Title null or empty: " + title);
    }
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  // metodo astratto che manda in esecuzione il contenuto multimediale
  public abstract void execute();

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" +
        "title='" + title + '\'' +
        '}';
  }
}
