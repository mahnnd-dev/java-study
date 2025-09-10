package dev.m.service;

import dev.m.entity.OrmJpa;
import dev.m.interf.OrmRepository;
import dev.m.repository.OrmRepoImpl;

public class OrmService {
    private final OrmRepository ormRepo = new OrmRepoImpl();

    public void add(OrmJpa ormJpa) {
        // theme logic kiem tra
        ormRepo.add(ormJpa);
    }

    public void update(Long id) {
        // theme logic kiem tra
        ormRepo.update(id);
    }

    public void findById(Long id) {
        // theme logic kiem tra
        ormRepo.findById(id);
    }

    public void deleteById(Long id) {
        ormRepo.deleteById(id);
    }

    public void findAll() {
        // theme logic kiem tra
        ormRepo.findAll();
    }
}
