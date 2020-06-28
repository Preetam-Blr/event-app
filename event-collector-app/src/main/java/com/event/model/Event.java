package com.event.model;

import java.util.UUID;

public class Event {
    private String data;
    private Long time;

    public Event() {
        this.data = UUID.randomUUID().toString();
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
