//package com.ngthuc.syums.object.old;
//
//import com.ngthuc.syums.entity.Person;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "account")
//public class Account {
//
//    @Id
//    @Column(name = "userId")
//    private String userId;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @MapsId
//    private Person user;
//
//    @Column(name = "password", length = 60, nullable = false)
//    private String password;
//
//    @Column(name = "email")
//    private String email;
//
//    public Account(){}
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public Person getUser() {
//        return user;
//    }
//
//    public void setUser(Person user) {
//        this.user = user;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}
