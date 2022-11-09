package org.itcg.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ItcgLibraryWebServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ItcgLibraryWebServiceApplication.class, args);
  }
}
