package com.example.triselectif;

import java.util.List;

// Définition d'une poubelle intelligente
public class PoubelleIntelligente {
    public Integer identifiant;
    public float volumeMax;
    public List<Dechet> listDechets;

    // Vérifie si l'on peut ajouter des déchets dans la poubelle, si celle-ci n'est pas remplie
    public boolean ajouteDechet(Dechet dechet){
        if (volumeMax < getVolume() + dechet.volume){
            System.out.println("La poubelle est trop remplie");
            return false;
        }
        else {
            System.out.println("Dechet ajouté : " + dechet.volume + " du type " + dechet.type);
            this.listDechets.add(dechet);
            return true;
        }
    }

    // Vide la poubelle
    public void viderPoubelle(){
        this.listDechets.clear();
    }

    // Getter pour l'identifiant de la poubelle
    public Integer getIdentifiant(){
        return identifiant;
    }

    // Getter pour la quantité de déchets dans la poubelle, calcule la somme de quantité de déchets de tous les types dans la poubelle
    public float getVolume(){
        float accumulateur = 0;
        for (int i = 0; i < this.listDechets.size(); i++){
            accumulateur += listDechets.get(i).volume;
        }

        return accumulateur;
    }

    // Liste tous les déchets présent dans la poubelle
    public void listerDechets(){
        System.out.println("Affichage des déchets dans la poubelle ");
        for (int i = 0; i < this.listDechets.size(); i++) {
            System.out.println(listDechets.get(i).volume  + ", " + listDechets.get(i).type);
        }
    }
}