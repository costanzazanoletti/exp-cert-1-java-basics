package org.learning.exercises.library;

public class Book {

  // ATTRIBUTI
  private String title; // not empty
  private String authors; // not empty
  private String publisher; // not empty

  private int numberOfPages; // positive

  // COSTRUTTORI

  public Book(String title, String authors, String publisher, int numberOfPages)
      throws BookIllegalParameterException {
    // valido i campi
    validateStringNotEmpty(title, "title");
    validateStringNotEmpty(authors, "authors");
    validateStringNotEmpty(publisher, "publisher");
    validateNumberIsPositive(numberOfPages, "number of pages");
    this.title = title;
    this.authors = authors;
    this.publisher = publisher;
    this.numberOfPages = numberOfPages;
  }

  // GETTER e SETTER

  public String getTitle() {
    return title;
  }

  public String getAuthors() {
    return authors;
  }

  public String getPublisher() {
    return publisher;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setTitle(String title) throws BookIllegalParameterException {
    validateStringNotEmpty(title, "title");
    this.title = title;
  }

  public void setAuthors(String authors) throws BookIllegalParameterException {
    validateStringNotEmpty(authors, "authors");
    this.authors = authors;
  }

  public void setPublisher(String publisher) throws BookIllegalParameterException {
    validateStringNotEmpty(publisher, "publisher");
    this.publisher = publisher;
  }

  public void setNumberOfPages(int numberOfPages) throws BookIllegalParameterException {
    validateNumberIsPositive(numberOfPages, "number of pages");
    this.numberOfPages = numberOfPages;
  }

  // METODI
  // metodo che solleva un'eccezione se la stringa passata è null o empty
  private void validateStringNotEmpty(String value, String field)
      throws BookIllegalParameterException {
    if (value == null || value.isEmpty()) {
      throw new BookIllegalParameterException(field + " null or empty");
    }
  }

  // metodo che solleva un'eccezione
  private void validateNumberIsPositive(int value, String field)
      throws BookIllegalParameterException {
    if (value <= 0) {
      throw new BookIllegalParameterException(field + " <= 0");
    }
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", authors='" + authors + '\'' +
        ", publisher='" + publisher + '\'' +
        ", numberOfPages=" + numberOfPages +
        '}';
  }
}
