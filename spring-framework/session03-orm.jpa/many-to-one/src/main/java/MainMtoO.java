import dev.m.entity.Major;
import dev.m.entity.Student;
import dev.m.infra.JpaUtil;

import javax.persistence.EntityManager;

public class MainMtoO {
    public static void main(String[] args) {
        createMajorStudents();
    }

    public static void createMajorStudents() {
        Major m1 = new Major("SE", "software engineer");
        Major m2 = new Major("GD", "graphic design");

        Student s1 = new Student("S1", "An", 2000, 9.0);
        Student s2 = new Student("S2", "Binh", 2001, 8.0);
        s1.setMajor(m1);
        s2.setMajor(m2);
        persist(m1);
        persist(m2);
        persist(s1);
        persist(s2);
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
