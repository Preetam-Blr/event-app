package com.event.registry;

import com.event.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventRegistry {

    private List<Event> events = new ArrayList<>();

    public  List<Event> read() {
        List<Event> returnEvents = events.stream().collect(Collectors.toList());
        events.clear();
        return returnEvents;
    }

    public  void add(Event e) {
        events.add(e);
    }

}
