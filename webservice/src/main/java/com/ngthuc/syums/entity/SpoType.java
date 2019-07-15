package com.ngthuc.syums.entity;

import javax.persistence.*;

@Entity
@Table(name = "spo_type")
public class SpoType {

    /**
     * SPO: Social and Policial Organization
     */

    @Id
    @Column(name = "keyType",length = 5)
    private String key;

    @Column(name = "nameType")
    private String name;

    public SpoType(String name) {
        this.name = name;
        this.key = toKey(name);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String toKey(String name) {
        String executeTrim = name.trim();
        String[] stringArray = executeTrim.split("\\ ");
        String nameFinal = "";
        for (String string : stringArray) {
            nameFinal += string.charAt(0);
        }
        return nameFinal.toUpperCase();
    }
}
