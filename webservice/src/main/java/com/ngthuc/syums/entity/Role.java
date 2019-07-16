package com.ngthuc.syums.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "position")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "position_scope",
//            joinColumns = { @JoinColumn(name = "positionId") },
//            inverseJoinColumns = { @JoinColumn(name = "scope") }
//    )
//    Set<Scope> listScope = new HashSet<>();

    @Column(name = "master")
    private Boolean master;

    @ManyToOne
    @JoinColumn(name = "type")
    private OrgType orgType;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<Management> managements;

    public Role() {}

    public Role(String name, Boolean isMaster) {
        this.name = name;
        this.master = isMaster;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Set<Scope> getListScope() {
//        return listScope;
//    }
//
//    public void setListScope(Set<Scope> listScope) {
//        this.listScope = listScope;
//    }

    public Boolean isMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        master = master;
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
