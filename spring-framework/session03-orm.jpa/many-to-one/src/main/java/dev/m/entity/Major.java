package dev.m.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Major(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
