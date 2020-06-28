package com.event.collector;

import com.event.model.Event;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EventCollector {

    private final RestTemplate template = new RestTemplate();

    @Autowired
    private EventRegistry eventRegistry;

    @Scheduled(fixedRate = 1000)
    public void collectEvents() {
        Event[] events = template.exchange("http://localhost:8080/events/emit/", HttpMethod.GET, null, Event[].class).getBody();
        eventRegistry.addAll(events);
    }
}
