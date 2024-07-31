package com.learnjava;


import java.util.Scanner;

public class jeuCapital {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String France;
        String capital1 = "paris";
        int c = 0;

        System.out.println("Quelle est la capitale de France ?");
        France = clavier.nextLine();

        if (France.equalsIgnoreCase(capital1)) {
            System.out.println("Bonne reponse!!");
            c++;
        } else {
            System.out.println("Mauvaise reponse. Vous devriez repondre Paris");

        }
        // DEUXIEME
        String Belgique;
        String capital2 = "Bruxelle";
        System.out.println("Quelle est la capitale de Belgique ?");
        Belgique = clavier.nextLine();

        if (Belgique.equalsIgnoreCase(capital2)) {
            System.out.println("Bonne reponse!!");
            c++;
        } else {
            System.out.println("Mauvaise reponse. Vous devriez repondre Bruxelle");

        }
        //TROISIEME

        String Cameroun;
        String Capital3 = "Douala";
        System.out.println("Quelle est la capitale de Cameroun ?");
        Cameroun = clavier.nextLine();

        if (Cameroun.equalsIgnoreCase(Capital3)) {
            System.out.println("Bonne reponse!!");
            c++;
        } else {
            System.out.println("Mauvaise reponse. Vous devriez repondre Douala");

        }
        //QUATRIEME

        String Centrafrique;
        String Capital4 = "Bangui";
        System.out.println("Quelle est la capitale de Centrafrique ?");
        Centrafrique = clavier.nextLine();

        if (Centrafrique.equalsIgnoreCase(Capital4)) {
            System.out.println("Bonne reponse!!");
            c++;
        } else {
            System.out.println("Mauvaise reponse. Vous devriez repondre Bangui");


        }
//CINQUIEME
        String Tchad;
        String Capital5 = "Ndjamena";
        System.out.println("Quelle est la capitale de Tchad ?");
        Tchad = clavier.nextLine();

        if (Tchad.equalsIgnoreCase(Capital5)) {
            System.out.println("Bonne reponse!!");
            c++;
        } else {
            System.out.println("Mauvaise reponse. Vous devriez repondre Ndjamena");

        }
        System.out.println();
        System.out.println("C'est terminé et Votre score est: "+c+"/"+5);
}
}
