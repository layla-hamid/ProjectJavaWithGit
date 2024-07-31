package com.learnjava;

import java.util.Scanner;

public class calculatrice {
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Entrer un premier chiffre :");
		n1 = clavier.nextInt();
		System.out.println("Entrer un deuxieme chiffre :");
		n2 = clavier.nextInt();
		System.out.println("la somme des 2 chiffres donne : " +(n1+n2));
		System.out.println("la multiplication des 2 chiffres donne : " +(n1*n2));
		System.out.println("la division des 2 chiffres donne : " +(n1/n2));
		System.out.println("le modulo de ces 2 chiffres donne : " +(n1%n2));
		System.out.println("la soustraction de ces 2 chiffres donne : " +(n1-n2));
	}

}
