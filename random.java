package com.learnjava;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Fixer la graine à 12345
        Random rand = new Random(5);
        
        // Générer un nombre entier aléatoire entre 0 et 99
        int randomInt = rand.nextInt(100);
        System.out.println("Nombre entier aléatoire: " + randomInt);
    }
}
