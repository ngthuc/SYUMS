package com.ngthuc.syums.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = { "subordinates" })
@Table(name = "organisation")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Organisation parent;

    @OneToMany(fetch = FetchType.LAZY,mappedBy="parent")
    private Set<Organisation> subordinates = new HashSet<Organisation>();

    public Organisation() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Organisation getParent() {
        return parent;
    }

    public void setParent(Organisation parent) {
        this.parent = parent;
    }
}