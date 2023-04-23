package com.example.triselectif;

import java.util.ArrayList;

// Définitnion d'un poubelle bleue héritant de la classe PoubelleIntelligente
public class PoubelleBleue extends PoubelleIntelligente {
    public String couleur;
    public Integer latitude;
    public Integer longitude;

    // Constructeur d'une poubelle bleue
    public PoubelleBleue(Integer identifiant, float volume){
        this.identifiant = identifiant;
        this.couleur = "bleue";
        this.volumeMax = volume;
        this.listDechets = new ArrayList<>();
    }

    // Setter pour la position d'une poubelle
    public void setPlace(Integer latitude1, Integer longitude1){
        latitude = latitude1;
        longitude = longitude1;
    }

    // Getter pour la couleur de la poubelle
    public String getCouleur(){
        return couleur;
    }
}
