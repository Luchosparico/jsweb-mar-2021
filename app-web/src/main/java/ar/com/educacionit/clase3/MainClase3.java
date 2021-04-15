package ar.com.educacionit.clase3;

import ar.com.educacionit.clase2.Auto;

public class MainClase3 {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		//Setear una marca en el auto
		
		auto.setMarca("Ford");
		
		String marca = auto.getMarca();
		
		auto.encender();
		
		auto.acelerar();
		
		auto.informarestado();
	}

}
