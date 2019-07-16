package com.ngthuc.syums.entity;

import com.ngthuc.syums.object.dto.OrgTypeDto;

import javax.persistence.*;

@Entity
@Table(name = "org_type")
public class OrgType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "spoOf")
    private Organization organization;

    public OrgType(OrgTypeDto dto) {
        if (dto.getOrganization() != null) {
            this.code = dto.toCode();
            this.name = dto.getName();
            this.organization = dto.getOrganization();
        } else {
            this.code = dto.getCode();
            this.name = dto.getName();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
