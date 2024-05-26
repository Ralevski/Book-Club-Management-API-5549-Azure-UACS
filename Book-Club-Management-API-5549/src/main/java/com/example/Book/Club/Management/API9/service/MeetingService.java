package com.example.Book.Club.Management.API9.service;

import com.example.Book.Club.Management.API9.dto.MeetingDto;
import com.example.Book.Club.Management.API9.model.Book;
import com.example.Book.Club.Management.API9.model.Meeting;
import com.example.Book.Club.Management.API9.repository.BookRepository;
import  com.example.Book.Club.Management.API9.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;
    @Autowired
    private BookRepository bookRepository;

    public Meeting createMeeting(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    public Meeting updateMeeting(Long id, Meeting meetingDetails) {
        Meeting meeting = meetingRepository.findById(id).orElseThrow();
        meeting.setLocation(meetingDetails.getLocation());
        meeting.setDateTime(meetingDetails.getDateTime());
        meeting.setBook(meetingDetails.getBook());
        return meetingRepository.save(meeting);
    }

    public void deleteMeeting(Long id) {
        meetingRepository.deleteById(id);
    }
}