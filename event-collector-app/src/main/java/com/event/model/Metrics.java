package com.event.model;

import java.util.List;

public class Metrics {
   
    private Integer eventCountTotal;
    private Integer eventCountLastFiveMin;
    private Integer eventCountLastTenMin;
    private Integer eventCountlLastThirtyMin;
    private List<List<Event>> eventsAll;

    
    public Metrics( List<List<Event>> events,int totalCnt,int fiveMinCnt,int tenMinCnt,int thirtyMincnt) {
        this.eventsAll = events;
        this.eventCountTotal = totalCnt;
        this.eventCountLastFiveMin=fiveMinCnt;
        this.eventCountLastTenMin=tenMinCnt;
        this.eventCountlLastThirtyMin=thirtyMincnt;
    }

   
	public List<List<Event>> getEventsAll() {
		return eventsAll;
	}
	public void setEventsAll(List<List<Event>> eventsAll) {
		this.eventsAll = eventsAll;
	}
	public Integer getEventCountTotal() {
		return eventCountTotal;
	}
	public void setEventCountTotal(Integer eventCountTotal) {
		this.eventCountTotal = eventCountTotal;
	}
	public Integer getEventCountLastFiveMin() {
		return eventCountLastFiveMin;
	}
	public void setEventCountLastFiveMin(Integer eventCountLastFiveMin) {
		this.eventCountLastFiveMin = eventCountLastFiveMin;
	}
	public Integer getEventCountLastTenMin() {
		return eventCountLastTenMin;
	}
	public void setEventCountLastTenMin(Integer eventCountLastTenMin) {
		this.eventCountLastTenMin = eventCountLastTenMin;
	}
	public Integer getEventCountlLastThirtyMin() {
		return eventCountlLastThirtyMin;
	}
	public void setEventCountlLastThirtyMin(Integer eventCountlLastThirtyMin) {
		this.eventCountlLastThirtyMin = eventCountlLastThirtyMin;
	}
	
    
}
