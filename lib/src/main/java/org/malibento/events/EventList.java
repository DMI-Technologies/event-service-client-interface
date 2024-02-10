package org.malibento.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class EventList {
    private List<Event> events;

    @JsonCreator
    public EventList(@JsonProperty("events") List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public EventList setEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventList eventList = (EventList) o;
        return Objects.equals(events, eventList.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events);
    }
}
