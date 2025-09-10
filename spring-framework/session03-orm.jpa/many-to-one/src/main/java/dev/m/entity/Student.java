package dev.m.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Setter
@Getter
public class Student {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Yob")
    private Integer yob;
    @Column(name = "Gpa")
    private Double gpa;

    @JoinColumn(name = "MajorId")
    @ManyToOne
    private Major major;

    public Student(String id, String name, Integer yob, Double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
}
