package com.menescal.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menescal.library.model.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
