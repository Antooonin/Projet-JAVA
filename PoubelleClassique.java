package com.example.triselectif;

import java.util.ArrayList;

// Définition de la classe PoubelleClasse qui hérite de la classe PoubelleIntelligente
public class PoubelleClassique extends PoubelleIntelligente {
    public String couleur;
    public Integer latitude;
    public Integer longitude;

    // Constructeur d'une poubelle classique
    public PoubelleClassique(Integer identifiant, float volume){
        this.identifiant = identifiant;
        this.couleur = "classique";
        this.volumeMax = volume;
        this.listDechets = new ArrayList<>();
    }
    // Permet de set la position d'une poubelle classique
    public void setPlace(Integer latitude1, Integer longitude1){
        latitude = latitude1;
        longitude = longitude1;
    }

    // Getter pour la couleur de la poubelle
    public String getCouleur(){
        return couleur;
    }
}
