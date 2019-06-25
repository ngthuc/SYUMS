package com.ngthuc.syums.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "position_scope",
            joinColumns = { @JoinColumn(name = "positionId") },
            inverseJoinColumns = { @JoinColumn(name = "scope") }
    )
    Set<Scope> listScope = new HashSet<>();

    @Column(name = "isMaster")
    private Boolean isMaster;

    public Position() {}

    public Position(String name, Boolean isMaster) {
        this.name = name;
        this.isMaster = isMaster;
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

    public Set<Scope> getListScope() {
        return listScope;
    }

    public void setListScope(Set<Scope> listScope) {
        this.listScope = listScope;
    }

    public Boolean isMaster() {
        return isMaster;
    }

    public void setMaster(Boolean master) {
        isMaster = master;
    }
}
