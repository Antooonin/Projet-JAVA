package com.example.triselectif;

import java.util.ArrayList;

// Définition d'une poubelle verte qui hérite de la classe PoubelleIntelligente
public class PoubelleVerte extends PoubelleIntelligente {
    public String couleur;
    public Integer latitude;
    public Integer longitude;

    // Constructeur de la poubelle
    public PoubelleVerte(Integer identifiant, float volume){
        this.identifiant = identifiant;
        this.couleur = "verte";
        this.volumeMax = volume;
        this.listDechets = new ArrayList<>();
    }

    // Set la position de la poubelle
    public void setPlace(Integer latitude1, Integer longitude1){
        latitude = latitude1;
        longitude = longitude1;
    }

    // Recupère la couleur de la poubelle
    public String getCouleur(){
        return couleur;
    }
}
