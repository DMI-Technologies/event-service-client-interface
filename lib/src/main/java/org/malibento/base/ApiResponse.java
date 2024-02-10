package org.malibento.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private T data;
    private List<Error> errors;
    private Boolean success;

    public static <T> ApiResponse<T> empty() {
        return new ApiResponse<>(null, null, null);
    }

    @JsonCreator
    public ApiResponse(@JsonProperty("data") T data,
                       @JsonProperty("success") Boolean success,
                       @JsonProperty("errors") List<Error> errors) {
        this.data = data;
        this.success = success;
        this.errors = errors;
    }

    public Boolean getSuccess() {
        return success;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public T getData() {
        return data;
    }

    public ApiResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public ApiResponse<T> setErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    public ApiResponse<T> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiResponse<?> that = (ApiResponse<?>) o;
        return Objects.equals(data, that.data) && Objects.equals(errors, that.errors) && Objects.equals(success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors, success);
    }
}
