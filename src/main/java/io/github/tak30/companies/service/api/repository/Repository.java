package io.github.tak30.companies.service.api.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T, R> {

    void add(T entity) throws Exception;

    Optional<T> get(R id);

    List<T> getAll();

    void update(T entity) throws Exception;

}
