package com.example.springbootlibraryapp.dao;

import com.example.springbootlibraryapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
