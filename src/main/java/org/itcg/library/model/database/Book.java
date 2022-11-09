package org.itcg.library.model.database;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Book {
  @Id private String id;
  private String ISBN;
  private String name;
  private String author;
  private Date releaseDate = new Date();
  private String editorial;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }
}
