package com.ngthuc.syums.entity;

import javax.persistence.*;

@Entity
@Table(name = "orgpeopos")
public class OrgPeoPos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "org_id", nullable = false)
    private Organisation organisation;

    @ManyToOne
    @JoinColumn(name = "people_id", nullable = false)
    private People people;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    public OrgPeoPos(Organisation organisation, People people, Position position) {
        this.organisation = organisation;
        this.people = people;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
