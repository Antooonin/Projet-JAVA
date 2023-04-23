package com.example.triselectif;

import java.io.IOException;

public class MainTest {

    public static void main(String[] args) throws IOException {

        // Création d'un ménage
        Menage Anto = new Menage("Anto");

        // Création de différent types de déchets
        Dechet dechet1 = new Dechet(TypeDechet.Carton, 2);
        Dechet dechet2 = new Dechet(TypeDechet.Metal, 5);
        Dechet dechet3 = new Dechet(TypeDechet.Papier, 1);


        // Création d'une poubelle
        PoubelleBleue poubelle1 = new PoubelleBleue(1, 12);
        PoubelleJaune poubelle2 = new PoubelleJaune(2, 15);


        // Création d'un centre de tri
        CentreTri centreDeTri = new CentreTri("Centre de tri 1");


        // Création d'un commerce
        Commerce commerce1 = new Commerce("IKEA");

        // Dépot de différents déchets dans les poubelles
        Anto.deposerDechet(dechet1, poubelle1);
        Anto.deposerDechet(dechet1, poubelle1);
        Anto.deposerDechet(dechet1, poubelle1);

        Anto.deposerDechet(dechet2, poubelle1);
        Anto.deposerDechet(dechet2, poubelle1);

        Anto.deposerDechet(dechet3, poubelle2);
        Anto.deposerDechet(dechet3, poubelle2);

        // Affichage des déchets dans les différentes poubelles
        poubelle1.listerDechets();
        poubelle2.listerDechets();

        // Affichage de l'historique des déchets déposés
        Anto.afficherHistorique();

        // Vidage des poubelles dans le centre de tri
        centreDeTri.ajouterDechet(poubelle1);
        centreDeTri.ajouterDechet(poubelle2);

        // Affichage des différents déchets à trier
        centreDeTri.afficherDechetsNonTries();

        // Trie de sdéchets
        centreDeTri.trier();

        // Affichage des déchets triés
        centreDeTri.afficherDechetsTries();

        // Affichage des points de fidélités accumulés
        Anto.afficherPoints();

        // Utilisation des points de fidélité
        Anto.acheter(commerce1, 50);
    }
}