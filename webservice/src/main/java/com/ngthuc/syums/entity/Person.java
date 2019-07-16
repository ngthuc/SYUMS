package com.ngthuc.syums.entity;

//import com.ngthuc.syums.object.old.Account;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id", unique = true, length = 20, nullable = false)
    private String id;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    private Account account;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "isOfficer", nullable = false)
    private boolean isOfficer = false;

    @Column(name = "hasAccount", nullable = false)
    private boolean hasAccount = false;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "person_organization",
            joinColumns = { @JoinColumn(name = "person") },
            inverseJoinColumns = { @JoinColumn(name = "joinOrg") }
    )
    Set<Organization> organizations = new HashSet<>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Management> managements;

    public Person() {}

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, boolean isOfficer) {
        this.id = id;
        this.isOfficer = isOfficer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isOfficer() {
        return isOfficer;
    }

    public void setOfficer(boolean officer) {
        isOfficer = officer;
    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public void setHasAccount(boolean hasAccount) {
        this.hasAccount = hasAccount;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }

    public Set<Management> getManagements() {
        return managements;
    }

    public void setManagements(Set<Management> managements) {
        this.managements = managements;
    }
}
