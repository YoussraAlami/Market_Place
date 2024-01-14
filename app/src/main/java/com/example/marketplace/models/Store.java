package com.example.marketplace.models;

import java.util.Set;

public class Store {

    private Long idStore;

    @Override
    public String toString() {
        return "Store{" +
                "idStore=" + idStore +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Long getIdStore() {
        return idStore;
    }

    public Store(Long idStore, String nom, String description) {
        this.idStore = idStore;
        this.nom = nom;
        this.description = description;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String nom;

    private String description;



}

