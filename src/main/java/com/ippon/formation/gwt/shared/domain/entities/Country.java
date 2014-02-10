package com.ippon.formation.gwt.shared.domain.entities;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Country implements IsSerializable {

    private String code;
    private String libelle;

    public Country() {
    }

    public Country(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
