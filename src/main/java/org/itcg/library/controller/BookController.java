package org.itcg.library.controller;

import java.util.Collection;
import org.itcg.library.model.database.Book;
import org.itcg.library.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/books")
@CrossOrigin("http://localhost:3000")
public class BookController {

  private final BookService service;

  public BookController(BookService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<Book> create(@RequestBody Book book) {
    return new ResponseEntity<>(service.save(book), HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<Collection<Book>> loadAll() {
    return new ResponseEntity<>(service.loadAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Book> load(@PathVariable String id) {
    return new ResponseEntity<>(service.load(id), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable String id) {
    service.delete(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PutMapping
  public ResponseEntity<Book> put(@RequestBody Book book) {
    return new ResponseEntity<>(service.save(book), HttpStatus.CREATED);
  }
}
