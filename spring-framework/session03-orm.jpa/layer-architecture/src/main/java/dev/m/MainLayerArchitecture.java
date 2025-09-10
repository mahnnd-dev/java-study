package dev.m;

import dev.m.entity.OrmJpa;
import dev.m.service.OrmService;

public class MainLayerArchitecture {

    public static void main(String[] args) {
        OrmJpa ormJpa = new OrmJpa("manhnd", "jpa", "orm", "hibernate", "04/09/2025");
        OrmJpa ormJpa1 = new OrmJpa("manhnd1", "jpa1", "orm1", "hibernate1", "04/09/2025");

        OrmService service = new OrmService();
        service.add(ormJpa);
        service.add(ormJpa1);
        service.deleteById(1L);
        service.findAll();
    }
}