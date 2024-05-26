package com.example.Book.Club.Management.API9.dto;
//Kristijan Ralevski 5549

import java.time.LocalDateTime;

public class MeetingDto {
    public String location;
    public LocalDateTime dateTime;
    public Long bookId;


    public MeetingDto() {
    }

    public MeetingDto(String location, LocalDateTime dateTime, Long bookId) {
        this.location = location;
        this.dateTime = dateTime;
        this.bookId = bookId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setBookId(Long bookId)  {
        this.bookId = bookId;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Long getBookId() {
        return bookId;
    }
}
