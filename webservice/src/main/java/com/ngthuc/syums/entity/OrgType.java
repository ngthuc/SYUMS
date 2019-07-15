package com.ngthuc.syums.entity;

import javax.persistence.*;

@Entity
@Table(name = "org_type")
public class OrgType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "typeKey")
    private String key;

    @Column(name = "typeName")
    private String name;

    @OneToOne
    @JoinColumn(name = "spo")
    private SpoDetail spoDetail;

    public OrgType(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public OrgType(SpoType spoType) {
        
    }
}
