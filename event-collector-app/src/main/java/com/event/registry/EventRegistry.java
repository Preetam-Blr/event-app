package com.event.registry;

import com.event.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Component
public class EventRegistry {

    private final List<Event> events = new ArrayList<>();

    public void addAll(Event[] eventArray) {
        List<Event> emittedEvents = Arrays.stream(eventArray).collect(Collectors.toList());
        events.addAll(emittedEvents);
    }

    
    public List<List<Event>> readEventsAll() {
        Long currentTimeMs = System.currentTimeMillis();
        Long pastTimeMsFive = currentTimeMs - 5 * 60 *1000;
        Long pastTimeMsTen = currentTimeMs - 10 * 60 *1000;
        Long pastTimeMsThirty = currentTimeMs - 30 * 60 *1000;
        List<Event> copiedEvents = new CopyOnWriteArrayList<>(events);
        List<List<Event>> copiedEventsAll = new CopyOnWriteArrayList<>();
        copiedEventsAll.add(copiedEvents);
        copiedEventsAll.add(copiedEvents.stream().
                filter(e -> {
                    return e.getTime() >= pastTimeMsFive && e.getTime() <= currentTimeMs;
                }).collect(Collectors.toList()));
        copiedEventsAll.add(copiedEvents.stream().
                filter(e -> {
                    return e.getTime() >= pastTimeMsTen && e.getTime() <= currentTimeMs;
                }).collect(Collectors.toList()));
        copiedEventsAll.add(copiedEvents.stream().
                filter(e -> {
                    return e.getTime() >= pastTimeMsThirty && e.getTime() <= currentTimeMs;
                }).collect(Collectors.toList()));
        return copiedEventsAll;
    }
}
