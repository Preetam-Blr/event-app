package com.event.controller;

import com.event.model.Event;
import com.event.model.Metrics;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/metrics/")
public class MetricsController {

    @Autowired
    private EventRegistry eventRegistry;

    
    @GetMapping("all/")
    public Metrics collectEventsAll() {
        
        List<List<Event>> events = eventRegistry.readEventsAll();
        
        Metrics m = new Metrics(events,events.get(0).size(),events.get(1).size(),events.get(2).size(),events.get(3).size());
        return m;
    }
}
