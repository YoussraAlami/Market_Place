package com.example.marketplace.models;

public class Fournisseur {

    private Long idFournisseur;

    private String nom;
    private String adresse;

    public Fournisseur(Long idFournisseur, String nom, String adresse, String password) {
        this.idFournisseur = idFournisseur;
        this.nom = nom;
        this.adresse = adresse;
        this.password = password;
    }

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;



}
