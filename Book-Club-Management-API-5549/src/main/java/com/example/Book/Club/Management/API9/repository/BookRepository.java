package com.example.Book.Club.Management.API9.repository;
//Kristijan Ralevski 5549

import com.example.Book.Club.Management.API9.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.id = :id")
    Book findBookById(@Param("id") Long id);
}
