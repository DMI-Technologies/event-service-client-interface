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
    public Error(@JsonProperty final String detail,
                 @JsonProperty final String title) {
        this.title = title;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }

    public Error setDetail(final String detail) {
        this.detail = detail;
        return this;
    }

    public Error setTitle(final String title) {
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, title);
    }
}
