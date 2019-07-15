package com.ngthuc.syums.entity;

import javax.persistence.*;

@Entity
@Table(name = "spo_detail")
public class SpoDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "spoOf")
    private Organization organization;

    @OneToOne
    @JoinColumn(name = "type")
    private SpoType spoType;

    public SpoDetail(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public SpoType getSpoType() {
        return spoType;
    }

    public void setSpoType(SpoType spoType) {
        this.spoType = spoType;
    }
}
