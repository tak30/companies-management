package io.github.tak30.companies.service.impl;

import io.github.tak30.companies.model.Entity;
import io.github.tak30.companies.service.api.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsBasedRepository<T extends Entity<R>, R> implements Repository<T, R> {

    private Map<R, T> entities;

    public CollectionsBasedRepository() {
        entities = new ConcurrentHashMap<>();
    }

    @Override
    public void add(T entity) throws Exception {
        if (entities.containsKey(entity.getId())) {
            throw new Exception("Entity already exists");
        }
        entities.put(entity.getId(), entity);
    }

    @Override
    public Optional<T> get(R id) {
        return Optional.ofNullable(entities.get(id));
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(entities.values());
    }

    @Override
    public void update(T entity) throws Exception {
        if (!entities.containsKey(entity.getId())) {
            throw new Exception("Entity doesn't exist");
        }
        entities.put(entity.getId(), entity);
    }
}
