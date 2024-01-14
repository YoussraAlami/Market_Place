package com.example.marketplace.models;

public class Categorie {
    private Long idCat;

    private String designation;

    @Override
    public String toString() {
        return "Categorie{" +
                "idCat=" + idCat +
                ", designation='" + designation + '\'' +
                '}';
    }

    public Categorie(Long idCat, String designation) {
        this.idCat = idCat;
        this.designation = designation;
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
