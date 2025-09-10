package dev.m.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
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
}
