package dev.m;

import dev.m.entity.Major;
import dev.m.entity.Student;
import dev.m.infra.JpaUtil;

import javax.persistence.EntityManager;

public class MainOtoM {
    public static void main(String[] args) {
        createMajorStudents();
    }

    public static void createMajorStudents() {
        Major major = new Major("SE", "software engineer");

        Student s1 = new Student("S1", "An", 2000, 9.0);
        Student s2 = new Student("S2", "Binh", 2001, 8.0);
        major.addStudent(s1);
        major.addStudent(s2);
        persist(major);

    }

    public static void persist(Object o) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        try {
            entityManager = JpaUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(o);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

}
