package ar.com.educacionit.interfaces.main;

import ar.com.educacionit.exceptions.checked.NoSabeException;
import ar.com.educacionit.interfaces.IIDioma;
import ar.com.educacionit.interfaces.entidades.Persona;
import ar.com.educacionit.interfaces.impl.Chino;
import ar.com.educacionit.interfaces.impl.Espanol;
import ar.com.educacionit.interfaces.impl.Ingles;

public class MainIdiomas2 {

	public static void main(String[] args) {
	
		IIDioma chino = new Chino();
		Persona Luciano = new Persona("Luciano", "Sparico", chino);
		
		Luciano.decir("Hola");
		
		IIDioma ingles = new Ingles();
		Luciano.aprender(ingles);
		Luciano.aprender(chino);
		
		try {
			Luciano.traducir("Hola", chino, ingles);
		}catch (NoSabeException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally se ejecuta siempre");
		}
		
		System.out.println("fin del programa");
		
	
				

	}

}
