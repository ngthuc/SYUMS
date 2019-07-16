package com.ngthuc.syums.object.old;

import com.ngthuc.syums.entity.Person;
import com.ngthuc.syums.object.enumtype.SocialKey;

import javax.persistence.*;

@Entity
@Table(name = "people_detail")
public class PeopleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "socialKey")
    private SocialKey socialKey;

    @Column(name = "socialValue")
    private String socialValue;

    @ManyToOne
    @JoinColumn(name = "peopleId")
    private Person person;

    public PeopleDetail() {}

    public PeopleDetail(Person person, SocialKey key, String value) {
        this.person = person;
        this.socialKey = key;
        this.socialValue = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SocialKey getSocialKey() {
        return socialKey;
    }

    public void setSocialKey(SocialKey socialKey) {
        this.socialKey = socialKey;
    }

    public String getSocialValue() {
        return socialValue;
    }

    public void setSocialValue(String socialValue) {
        this.socialValue = socialValue;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
