package com.d3v0n.d3v0n.controller;

import com.d3v0n.d3v0n.controller.dto.Response;
import com.d3v0n.d3v0n.model.Events;
import com.d3v0n.d3v0n.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventsController {

    @Autowired
    EventsRepository eventsRepository;

    @PostMapping
    public Response create(@RequestBody Events events) {
        LocalDateTime now = LocalDateTime.now();
        events.setCreated_at(now.toString());
        eventsRepository.save(events);
        Response response = new Response();
        response.setMessage("Event created successfully");
        response.setStatus(200);
        return response;
    }

    @PutMapping
    public Response update(@RequestBody Events events) {
        events.setUpdated_at(LocalDateTime.now().toString());
        eventsRepository.save(events);
        Response response = new Response();
        response.setMessage("Event updated successfully");
        response.setStatus(200);
        return response;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        eventsRepository.deleteById(id);
        return "Event deleted successfully";
    }

    @GetMapping
    public List<Events> getAll() {
        List<Events> events = eventsRepository.findAll();
        return events;
    }



}
