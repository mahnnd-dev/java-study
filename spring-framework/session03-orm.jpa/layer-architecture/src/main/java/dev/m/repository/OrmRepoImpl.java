package dev.m.repository;

import dev.m.entity.OrmJpa;
import dev.m.infra.JpaUtil;
import dev.m.interf.OrmRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class OrmRepoImpl implements OrmRepository {
    private EntityManager entityManager;

    public void add(OrmJpa ormJpa) {
        try {
            entityManager = JpaUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(ormJpa);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void update(Long id) {
        try {
            entityManager = JpaUtil.getEntityManager();
            OrmJpa list = entityManager.find(OrmJpa.class, id);
            list.setHibernate("hibernateNew");
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void findById(Long id) {
        try {
            entityManager = JpaUtil.getEntityManager();
            OrmJpa list = entityManager.find(OrmJpa.class, id);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void deleteById(Long id) {
        try {
            entityManager = JpaUtil.getEntityManager();
            entityManager.getTransaction().begin();
            OrmJpa list = entityManager.find(OrmJpa.class, id);
            entityManager.remove(list);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void findAll() {
        try {
            entityManager = JpaUtil.getEntityManager();
            List<OrmJpa> list = entityManager.createQuery("select x FROM OrmJpa x", OrmJpa.class)
                    .getResultList();
            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
