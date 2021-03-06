package com.ngthuc.syums.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties(value = { "subordinates" })
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "codename")
    private String codename;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="childOf")
    private Organization parent;

    @ManyToOne
    @JoinColumn(name = "type")
    private OrgType orgType;

    @ManyToMany(mappedBy = "organizations", cascade = CascadeType.ALL)
    private Set<Person> people;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private Set<Management> managements;

    public Organization() {}

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

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }

    public boolean isSpo() {
        return orgType.getOrganization() != null;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    public Set<Management> getManagements() {
        return managements;
    }

    public void setManagements(Set<Management> managements) {
        this.managements = managements;
    }
}