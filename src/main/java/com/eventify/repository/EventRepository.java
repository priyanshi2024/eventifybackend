package com.eventify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventify.entity.Event;
import com.eventify.entity.User;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

    List<Event> findByUserId(User userId);


}
