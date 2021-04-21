package ar.com.educacionit.interfaces.main;

import ar.com.educacionit.interfaces.IIDioma;
import ar.com.educacionit.interfaces.entidades.Persona;
import ar.com.educacionit.interfaces.impl.Espanol;
import ar.com.educacionit.interfaces.impl.Ingles;

public class MainIdiomas {

	public static void main(String[] args) {
	
		Persona Luciano = new Persona("Luciano", "Sparico", new Espanol());
		
		Luciano.decir("Hola");
		
		IIDioma Ingles = new Ingles();
		Luciano.aprender(Ingles);
		
		Luciano.decir("Hola", Ingles);
	
				

	}

}
