package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    //Question: Why these interfaces have no implementation methods
    //what does repository mean
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);
}
