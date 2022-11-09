package org.itcg.library.service;

import java.util.Collection;
import org.itcg.library.model.database.Book;

public interface BookService {
  public Book save(Book book);

  public Book load(String ISBN);

  public void delete(String ISBN);

  public Collection<Book> loadAll();
}
