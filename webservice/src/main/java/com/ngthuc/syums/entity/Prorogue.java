package com.ngthuc.syums.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "prorogue")
public class Prorogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prorogue")
    private String prorogue;

    @JsonIgnore
    @Column(name = "startYear")
    private String startYear;

    @JsonIgnore
    @Column(name = "endYear")
    private String endYear;

    @ManyToOne
    @JoinColumn(name = "")
    public Prorogue(String startYear, String endYear) {
        this.prorogue = startYear + " - " + endYear;
    }


}
