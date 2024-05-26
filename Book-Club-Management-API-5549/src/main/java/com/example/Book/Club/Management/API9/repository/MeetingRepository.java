package com.example.Book.Club.Management.API9.repository;
//Kristijan Ralevski 5549

import com.example.Book.Club.Management.API9.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}