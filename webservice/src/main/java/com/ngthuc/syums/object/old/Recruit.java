package com.ngthuc.syums.object.old;

import com.ngthuc.syums.entity.Person;
import com.ngthuc.syums.entity.Organization;
import com.ngthuc.syums.entity.Role;

import javax.persistence.*;

@Entity
@Table(name = "recruit")
public class Recruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orgId", nullable = false)
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "peopleId", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "positionId", nullable = false)
    private Role role;

    public Recruit(Organization organization, Person person, Role role) {
        this.organization = organization;
        this.person = person;
        this.role = role;
    }

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
