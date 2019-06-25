package com.ngthuc.syums.entity;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class People {

    @Id
    @Column(name = "id", unique = true, length = 20, nullable = false)
    private String id;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Account account;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "isOfficer", nullable = false)
    private boolean isOfficer = false;

    @Column(name = "hasAccount", nullable = false)
    private boolean hasAccount = false;

    public People() {}

    public People(String id) {
        this.id = id;
    }

    public People(String id, boolean isOfficer) {
        this.id = id;
        this.isOfficer = isOfficer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

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
}
