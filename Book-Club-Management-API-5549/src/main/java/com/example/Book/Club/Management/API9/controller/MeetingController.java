package com.example.Book.Club.Management.API9.controller;
//Kristijan Ralevski 5549

import com.example.Book.Club.Management.API9.dto.MeetingDto;
import com.example.Book.Club.Management.API9.model.Book;
import com.example.Book.Club.Management.API9.model.Meeting;
import com.example.Book.Club.Management.API9.service.BookService;
import  com.example.Book.Club.Management.API9.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {
    @Autowired
    private MeetingService meetingService;

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public Meeting createMeeting(@RequestBody MeetingDto meetingDto) {
        Meeting meeting1 = new Meeting();
        meeting1.setLocation(meetingDto.getLocation());
        meeting1.setDateTime(meetingDto.getDateTime());
        Book book = bookService.getBookById(meetingDto.getBookId());
        meeting1.setBook(book);
        return meetingService.createMeeting(meeting1);
    }

    @GetMapping
    public List<Meeting> getAllMeetings() {
        return meetingService.getAllMeetings();
    }

    @PutMapping("/{id}")
    public Meeting updateMeeting(@PathVariable Long id, @RequestBody Meeting meetingDetails) {
        return meetingService.updateMeeting(id, meetingDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMeeting(@PathVariable Long id) {
        meetingService.deleteMeeting(id);
    }
}