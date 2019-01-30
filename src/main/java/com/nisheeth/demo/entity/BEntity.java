package com.nisheeth.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "b")
public class BEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dbid")
    private Long id;

    @OneToOne(mappedBy = "bEntity")
    private AEntity aEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AEntity getaEntity() {
        return aEntity;
    }

    public void setaEntity(AEntity aEntity) {
        this.aEntity = aEntity;
    }
}
