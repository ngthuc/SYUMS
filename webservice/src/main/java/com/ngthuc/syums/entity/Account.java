package com.ngthuc.syums.entity;

import com.ngthuc.syums.object.SocialNetwork;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", length = 60, nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

//    @Column(name = "social")
//    private Map<SocialNetwork,String> social;

    public Account(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Map<SocialNetwork, String> getSocial() {
//        return social;
//    }
//
//    public void setSocial(Map<SocialNetwork, String> social) {
//        this.social = social;
//    }
}
