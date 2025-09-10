import dev.m.entity.Major;
import dev.m.entity.Student;
import dev.m.infra.JpaUtil;

import javax.persistence.EntityManager;

public class MainMtoM {
    public static void main(String[] args) {
        createMajorStudents();
    }

    public static void createMajorStudents() {
        Major m1 = new Major("SE", "software engineer");
        Major m2 = new Major("GD", "graphic design");
        Major m3 = new Major("TT", "TIKTOKER");

        Student s1 = new Student("S1", "An", 2000, 9.0);
        Student s2 = new Student("S2", "Binh", 2001, 8.0);
        Student s3 = new Student("S3", "Lam", 2001, 8.0);
        Student s4 = new Student("S4", "Kien", 2001, 8.0);

        m1.setStudent(s1);
        m1.setStudent(s3);
        m2.setStudent(s2);
        m2.setStudent(s2);
        m3.setStudent(s4);

        persist(m1);
        persist(m1);
        persist(m3);
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
