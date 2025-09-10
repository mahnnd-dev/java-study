package dev.m.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orm_jpa")
public class OrmJpa {
    @Id
//    AUTO → JPA tự chọn (thường Hibernate sẽ chọn SEQUENCE nếu DB hỗ trợ, hoặc IDENTITY cho MySQL).
//    IDENTITY → dùng auto-increment (MySQL, SQL Server).
//    SEQUENCE → dùng database sequence (PostgreSQL, Oracle).
//    TABLE → dùng một bảng riêng để mô phỏng sequence (ít dùng, chậm).
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "jpa")
    private String jpa;
    @Column(name = "orm")
    private String orm;
    @Column(name = "hibernate")
    private String hibernate;
    @Column(name = "create_date")
    private String createDate;

    public OrmJpa(String name, String jpa, String orm, String hibernate, String createDate) {
        this.name = name;
        this.jpa = jpa;
        this.orm = orm;
        this.hibernate = hibernate;
        this.createDate = createDate;
    }
}
