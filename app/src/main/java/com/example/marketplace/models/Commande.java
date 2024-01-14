package com.example.marketplace.models;

import java.util.List;

public class Commande {

    private Long idCmd;

    private String dateCmd;

    @Override
    public String toString() {
        return "Commande{" +
                "idCmd=" + idCmd +
                ", dateCmd='" + dateCmd + '\'' +
                '}';
    }

    public Commande(Long idCmd, String dateCmd) {
        this.idCmd = idCmd;
        this.dateCmd = dateCmd;
    }

    public Long getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(Long idCmd) {
        this.idCmd = idCmd;
    }

    public String getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(String dateCmd) {
        this.dateCmd = dateCmd;
    }
}

