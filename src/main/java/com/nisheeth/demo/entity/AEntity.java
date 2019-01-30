package com.nisheeth.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "a")
public class AEntity {

    @Id
    @Column(name = "b_id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = @org.hibernate.annotations.Parameter(name = "property", value = "b"))
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private BEntity bEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BEntity getbEntity() {
        return bEntity;
    }

    public void setbEntity(BEntity bEntity) {
        this.bEntity = bEntity;
    }
}
