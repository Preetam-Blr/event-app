package com.event.emitter;

import com.event.model.Event;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EventEmitter {

    @Autowired
    private EventRegistry eventRegistry;

    @Scheduled(fixedRate = 1000)
    public void publishEvent()
    {
       for(int i=0;i<5;i++) {
    	   eventRegistry.add(new Event());
       }
        
    }
}
