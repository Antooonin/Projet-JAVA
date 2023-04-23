package com.example.triselectif;

import java.util.Date;

// Définition de la classe Contrat
public class Contrat {
    public Date datedebut;
    public Date datefin;

    // Constructeur d'un contrat
    public Contrat(Date datedebut, Date datefin, Commerce commerce, CentreTri centreTri) {
        this.datedebut = datedebut;
        this.datefin = datefin;
    }
}