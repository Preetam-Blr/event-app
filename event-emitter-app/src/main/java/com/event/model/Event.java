package com.event.model;

import java.util.Random;

public class Event {
    private String data;
    private Long time;
    
    public Event() {
        this.data = String.valueOf((100000 + new Random().nextInt(900000)));
        this.time = System.currentTimeMillis();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
