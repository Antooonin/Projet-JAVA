package com.example.triselectif;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterfaceGraphique extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Charger l'image à utiliser comme fond d'écran
        Image backgroundImage = new Image("H:\\Desktop\\Cours\\3ème année - ING1 GM\\Semestre 2 - GMI\\Maths-Info\\Analyse et programmation orientée objet\\Projet\\poubelle.png");

        // Créer un panneau pour les boutons
        HBox panneauBoutons = new HBox();
        Button bouton1 = new Button("Bouton 1");

        /* Tentative de faire en sorte que le bouton exécute une commande de la partie terminale de l'application
        bouton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CentreTri.afficherDechetsNonTries();
            }
        }); */

        Button bouton2 = new Button("Bouton 2");
        panneauBoutons.getChildren().addAll(bouton1, bouton2);

        // Créer un ImageView pour afficher l'image
        ImageView backgroundImageView = new ImageView(backgroundImage);

        // Créer un StackPane pour organiser les éléments de l'interface utilisateur
        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundImageView, panneauBoutons);

        // Centrer l'image dans la fenêtre
        StackPane.setAlignment(backgroundImageView, Pos.CENTER);

        // Créer la scène
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Interface graphique : Tri selectif");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
