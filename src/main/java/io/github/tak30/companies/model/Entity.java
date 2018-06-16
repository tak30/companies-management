package io.github.tak30.companies.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Entity<T> {

    @EqualsAndHashCode.Include
    private T id;

}
