package com.betterjavacode.mongodbdemo.mongodbapp.repositories;

import com.betterjavacode.mongodbdemo.mongodbapp.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String>
{
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthor(String name);
}
