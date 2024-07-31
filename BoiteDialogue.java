package com.learnjava;
import javax.swing.*;

public class BoiteDialogue {

	public static void main(String[] args) {
		int nb1 = Integer.parseInt(JOptionPane.showInputDialog("Entrer un premier nombre!"));
		int nb2 = Integer.parseInt(JOptionPane.showInputDialog("Entrer un deuxième nombre!"));
		JOptionPane.showMessageDialog(null, "La somme de  " + nb1 + " et " + nb2 + " font\n  : " +(nb1+nb2));
		//JOptionPane.showMessageDialog(null,"Welcome to class Java!");

	}

}
