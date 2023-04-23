package com.example.triselectif;

import java.util.ArrayList;
import java.util.List;

// Définition de la classe CentreTri avec ses attributs et ses méthodes
public class CentreTri {
    public String nom;
    public List<Dechet> dechetnontrie;
    public List<List<Dechet>> listdechets;

    // Constructeur d'un centre de tri
    public CentreTri(String nom){
        this.nom = nom;
        listdechets = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            listdechets.add(new ArrayList<>());
        }
        dechetnontrie = new ArrayList<>();
    }

    // Méthode pour ajouter un déchet d'un poubelle vers un centre de tri
    public void ajouterDechet(PoubelleIntelligente poubelle){
        dechetnontrie.addAll(poubelle.listDechets);
    }

    // Affiche tous les déchets non triés du centre de tri
    public void afficherDechetsNonTries(){
        System.out.println("Liste des éléments non triés");
        for (Dechet dechet : dechetnontrie) {
            System.out.print(dechet.type + ", ");
        }
        System.out.println("\n");
    }

    // Affiche tous les déchets triés du centre de tri
    public void afficherDechetsTries(){
        TypeDechet[] type = TypeDechet.values();
        for (int i = 0; i < type.length; i++){
            System.out.print("Volume des éléments triés du type " + type[i] + " : ");
            for (int j = 0; j < listdechets.get(i).size(); j++){
                System.out.print(listdechets.get(i).get(j).volume + ", ");
            }
            System.out.println("\n");
        }
    }

    // Trie tous les déchets non triés
    public void trier() {
        TypeDechet[] type = TypeDechet.values();
        while (dechetnontrie.size() != 0) {
            int trie = 0;
            Dechet dechet = dechetnontrie.get(0);

            for (int i = 0; i < type.length; i++) {
                if (dechet.type == type[i]){
                    listdechets.get(i).add(dechet);
                    trie = 1;
                }
            }
            if (trie == 1){
                System.out.println("Element trié : " + dechet.type);
            }
            else {
                System.out.println("Impossible de trier le déchet : "+ dechet.type);
            }
            dechetnontrie.remove(dechet);
        }
    }
}
