package com.example.triselectif;

import java.io.IOException;
import java.util.ArrayList;

// Définition d'un ménage
public class Menage {

    public String nom;
    public String adresse;
    public int pointsFidelite;
    public ArrayList<Dechet> historique;

    // Constructeur d'un ménage
    public Menage(String nom){
        this.nom = nom;
        pointsFidelite = 0;
        historique = new ArrayList<>();
    }

    // Méthode permettant à un ménage de déposer des déchets dans sa poubelle
    public void deposerDechet(Dechet dechet, PoubelleIntelligente poubelle){
        if (poubelle.ajouteDechet(dechet)){
            pointsFidelite += dechet.volume;
            historique.add(dechet);
        }
    }

    // Méthode qui permet au ménage d'utiliser ses points de fidélité lors d'un achat
    public void acheter(Commerce commerce, int prix) throws IOException {
        int newPrix;
        if ((prix - pointsFidelite)>0){
            newPrix = prix - pointsFidelite;
        }
        else{
            newPrix = prix;
        }
        pointsFidelite -= (prix - newPrix);
        if (pointsFidelite < 0){
            pointsFidelite = 0;
        }
    }

    // Permet d'afficher les points de fidélité d'un ménage
    public void afficherPoints(){
        System.out.println("Vous possédez " + pointsFidelite + " points de fidélité");
    }

    // Permet d'afficher l'historique des dépôts d'un ménage
    public void afficherHistorique(){
        System.out.println("Historique des dépots");
        for (Dechet dechet : historique) {
            System.out.println(dechet.type + " : " + dechet.volume);
        }
    }

}
