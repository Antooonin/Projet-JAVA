package com.example.triselectif;

import java.util.ArrayList;

// Définition de la classe PoubelleJaune héritant de la classe PoubelleIntelligente
public class PoubelleJaune extends PoubelleIntelligente {
    public String couleur;
    public Integer latitude;
    public Integer longitude;

    // Constructeur de la poubelle
    public PoubelleJaune(Integer identifiant, float volume){
        this.identifiant = identifiant;
        this.couleur = "jaune";
        this.volumeMax = volume;
        this.listDechets = new ArrayList<>();
    }

    // Set la position de la poubelle
    public void setPlace(Integer latitude1, Integer longitude1){
        latitude = latitude1;
        longitude = longitude1;
    }

    // Getter pour la couleur de la poubelle
    public String getCouleur(){
        return couleur;
    }
}
