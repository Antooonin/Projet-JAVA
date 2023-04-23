package com.example.triselectif;

// Définition d'un déchet
public class Dechet {

    public TypeDechet type;
    public float volume;

    // Constructeur d'un déchet
    public Dechet(TypeDechet type, float volume){
        this.type = type;
        this.volume = volume;
    }
}
