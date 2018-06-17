package io.github.tak30.companies.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public abstract class Entity<T> {

    @JsonProperty(required = true)
    protected T id;

}
