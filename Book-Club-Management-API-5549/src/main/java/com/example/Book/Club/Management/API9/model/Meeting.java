package com.example.Book.Club.Management.API9.model;
//Kristijan Ralevski 5549

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    private LocalDateTime dateTime;
    @ManyToOne
    private Book book;

    public Meeting(String location, LocalDateTime dateTime, Book book) {
        this.location = location;
        this.dateTime = dateTime;
        this.book = book;
    }

    public Meeting(Long id, String location, LocalDateTime dateTime, Book book) {
        this.id = id;
        this.location = location;
        this.dateTime = dateTime;
        this.book = book;
    }

    public Meeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}