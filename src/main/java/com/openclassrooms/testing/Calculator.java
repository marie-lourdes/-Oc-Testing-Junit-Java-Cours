package com.openclassrooms.testing;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public void longCalculation() {
		try {
		    // Attendre 2 secondes
			//changer a 500ms pour que le test de la methode reussi , test qui a un delai de 1 seconde
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
