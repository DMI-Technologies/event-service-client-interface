package org.malibento.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@SuppressWarnings("unused")
public class Error {
    private String detail;
    private String title;

    public static Error empty() {
        return new Error(null, null);
    }

    @JsonCreator
    public Error(@JsonProperty("detail") String detail,
                 @JsonProperty("title") String title) {
        this.title = title;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }

    public Error setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public Error setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(detail, error.detail) && Objects.equals(title, error.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, title);
    }
}
