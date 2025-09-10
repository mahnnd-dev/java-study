package dev.m.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Major")
@NoArgsConstructor
@Setter
@Getter
public class Major {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "major")
    private List<Student> students = new ArrayList<>();


    public Major(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setStudent(Student student) {
        students.add(student);
        student.setMajor(this);
    }

    public void delStudent(Student student) {
        students.remove(student);
        student.setMajor(null);
    }

    public List<Student> getStudents() {
        return students;
    }
}
