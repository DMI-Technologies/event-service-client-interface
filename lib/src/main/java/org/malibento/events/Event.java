package org.malibento.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Objects;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
    private String title;
    private String subtitle;
    private String description;
    private String authorRef;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Location location;

    @JsonCreator
    public Event(@JsonProperty("title") String title,
                 @JsonProperty("subtitle") String subtitle,
                 @JsonProperty("description") String description,
                 @JsonProperty("authorRef") String authorRef,
                 @JsonProperty("start_date") LocalDateTime startDate,
                 @JsonProperty("end_date") LocalDateTime endDate,
                 @JsonProperty("created") LocalDateTime created,
                 @JsonProperty("updated") LocalDateTime updated,
                 @JsonProperty("location") Location location) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.authorRef = authorRef;
        this.startDate = startDate;
        this.endDate = endDate;
        this.created = created;
        this.updated = updated;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public Location getLocation() {
        return location;
    }

    public String getAuthorRef() {
        return authorRef;
    }

    public String getDescription() {
        return description;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    public Event setAuthorRef(String authorRef) {
        this.authorRef = authorRef;
        return this;
    }

    public Event setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public Event setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public Event setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Event setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public Event setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Event setUpdated(LocalDateTime updated) {
        this.updated = updated;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(subtitle, event.subtitle) && Objects.equals(description, event.description) && Objects.equals(authorRef, event.authorRef) && Objects.equals(startDate, event.startDate) && Objects.equals(endDate, event.endDate) && Objects.equals(created, event.created) && Objects.equals(updated, event.updated) && Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, subtitle, description, authorRef, startDate, endDate, created, updated, location);
    }
}
