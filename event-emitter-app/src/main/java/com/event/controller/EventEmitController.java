package com.event.controller;

import com.event.model.Event;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events/emit")
public class EventEmitController {

    @Autowired
    private EventRegistry eventRegistry;

    @GetMapping("/")
    public List<Event> emitEvents() {
        return eventRegistry.read();
    }

}
