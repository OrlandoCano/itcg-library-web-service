package org.itcg.library.service.impl;

import java.util.Collection;
import org.itcg.library.dao.BookRepository;
import org.itcg.library.model.database.Book;
import org.itcg.library.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository repository;

  public BookServiceImpl(BookRepository repository) {
    this.repository = repository;
  }

  @Override
  @Transactional
  public Book save(Book book) {
    if (book.getId() != null) {
      Book existingBook = repository.findById(book.getId()).orElse(null);
      if (existingBook != null) {
        existingBook.setAuthor(book.getAuthor());
        existingBook.setEditorial(book.getEditorial());
        existingBook.setISBN(book.getISBN());
        existingBook.setName(book.getName());
        existingBook.setReleaseDate(book.getReleaseDate());
        return repository.save(existingBook);
      }
    }
    return repository.insert(book);
  }

  @Override
  public Book load(String ISBN) {
    return repository.findById(ISBN).get();
  }

  @Override
  public void delete(String ISBN) {
    repository.deleteById(ISBN);
  }

  @Override
  public Collection<Book> loadAll() {
    return repository.findAll();
  }
}
