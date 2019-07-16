package com.ngthuc.syums.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "prorogue")
public class Prorogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prorogue")
    private String prorogue;

    @JsonIgnore
    @Column(name = "startYear")
    private String startYear;

    @JsonIgnore
    @Column(name = "endYear")
    private String endYear;

    @ManyToOne
    @JoinColumn(name = "type")
    private OrgType orgType;

    @OneToMany(mappedBy = "prorogue", cascade = CascadeType.ALL)
    private Set<Management> managements;

    public Prorogue(String startYear, String endYear) {
        this.prorogue = startYear + " - " + endYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProrogue() {
        return prorogue;
    }

    public void setProrogue(String prorogue) {
        this.prorogue = prorogue;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    public Set<Management> getManagements() {
        return managements;
    }

    public void setManagements(Set<Management> managements) {
        this.managements = managements;
    }
}
