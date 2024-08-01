package com.learnjava;

public class Calco {

	private int result;
	
	public void additionner(int... nombres) {
		
			for(int nombre: nombres) {
				result = result + nombre;
			}
			
		}
		

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
