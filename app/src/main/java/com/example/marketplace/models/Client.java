package com.example.marketplace.models;

public class Client {

    private Long idClient;

    private String nom;
    private String adresse;
    private String password;

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Client(Long idClient, String nom, String adresse, String password) {
        this.idClient = idClient;
        this.nom = nom;
        this.adresse = adresse;
        this.password = password;
    }
    public Client(){}

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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
}