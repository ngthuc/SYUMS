package com.ngthuc.syums.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

import java.util.HashSet;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String userName;

    @Column(name = "level", nullable = false)
    private Integer level;

    public Position() {}

    public Position(Long id, String userName, Integer level) {
        this.id = id;
        this.userName = userName;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}