package dev.m.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("database-postgres");

    private JpaUtil() {
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeFactory() {
        factory.close();
    }
}
