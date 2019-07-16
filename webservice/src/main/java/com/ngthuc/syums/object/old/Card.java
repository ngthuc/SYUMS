package com.ngthuc.syums.object.old;

import com.ngthuc.syums.entity.Person;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @Column(name = "id", length = 10)
    private String id;

    @ManyToOne
    @JoinColumn(name = "peopleId", nullable = false)
    private Person person;

    public Card(String id, Person person) {
        this.id = id;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
