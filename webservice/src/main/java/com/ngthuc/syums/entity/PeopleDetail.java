package com.ngthuc.syums.entity;

import com.ngthuc.syums.object.SocialKey;

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
    private People people;

    public PeopleDetail() {}

    public PeopleDetail(People people, SocialKey key, String value) {
        this.people = people;
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

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
