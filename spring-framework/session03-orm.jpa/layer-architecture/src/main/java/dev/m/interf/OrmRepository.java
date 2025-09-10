package dev.m.interf;

import dev.m.entity.OrmJpa;

public interface OrmRepository {
    void add(OrmJpa ormJpa);

    void update(Long id);

    void findById(Long id);

    void deleteById(Long id);

    void findAll();
}
