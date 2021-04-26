package ar.com.educacionit.interfaces.entidades;

import ar.com.educacionit.exceptions.checked.NoSabeException;
import ar.com.educacionit.interfaces.IIDioma;

public class Persona {

		private String nombre;
		private String apellido;
		
		private IIDioma idiomaNativo;
		private IIDioma[] idiomas;
		
		public Persona(String nombre, String apellido, IIDioma idiomaNativo) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.idiomaNativo = idiomaNativo;
			this.idiomas = new IIDioma[0];
		}
		
		public void aprender(IIDioma nuevoIdioma) {
			//Hay que controlar que el nuevo idioma no este en la lista actual
			//Home Work
			IIDioma[] actuales = new IIDioma[this.idiomas.length + 1];
			int i=0;
			for(IIDioma idiomaQueSabe : this.idiomas) {
				actuales[i++] = idiomaQueSabe;
			}
			actuales[i] = nuevoIdioma;
			this.idiomas = actuales;
		}
		public void traducir(String texto, IIDioma origen, IIDioma destino) throws NoSabeException, Exception {
			boolean sabeIdiomaOrigen = false;
			boolean sabeIdiomaDestino = false;
			
			for(IIDioma idiomaQueSabe : this.idiomas) {
				if(idiomaQueSabe.equals(origen)) {
					sabeIdiomaOrigen = true;
				}
				if(idiomaQueSabe.equals(destino)) {
					sabeIdiomaDestino = true;
					
				}
			}
			if(sabeIdiomaDestino) {
				if (sabeIdiomaOrigen) {
				System.out.println("Sabe los dos idiomas");
				}else {
					throw new Exception("No sabe" + origen.getClass().getCanonicalName());
				}
				
			}else {
				throw new NoSabeException("No sabe ambos idiomas");
			}
		}
		public void decir(String palabra) {
			this.idiomaNativo.decir(palabra);
		}
		
		public void decir(String palabra, IIDioma unIdioma) throws NoSabeException{
			boolean sabeEseIdioma = false;
			for(IIDioma idiomaQueSabe : this.idiomas) {
				if(idiomaQueSabe.equals(unIdioma)) {
					sabeEseIdioma = true;
					break;
				}
			}
			if(sabeEseIdioma) {
				unIdioma.decir(palabra);
			}else {
				//unIdioma.noseDecir(palabra);
				throw new NoSabeException(this.nombre + " - " + this.apellido + "," + palabra);
				
			}
}
}
