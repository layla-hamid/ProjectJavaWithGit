package com.learnjava;

public class TaskTest {

	public static void main(String[] args) {
		Task tsk = new Task("APPRENDRE JAVA POUR LES NULS ", "Tout ce qu'il faut savoir sur JAVA");
		System.out.println(tsk.title+"\n"+tsk.description);
		System.out.printf("Le titre est : %s" ,tsk.title);
		

	}

}
