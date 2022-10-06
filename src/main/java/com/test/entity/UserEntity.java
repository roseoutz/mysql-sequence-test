package com.test.entity;

import javax.persistence.*;

@Table
@Entity
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long oid;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public long getOid() {
        return oid;
    }
}
