package ar.com.educacionit.clase3;

public class BuscadorMain {

	public static void main(String[] args) {

		// instancio un buscador
		Buscador miBuscador = new Buscador();

		miBuscador.setClaveBusqueda("iron man");

		// ejecutar el buscador
		miBuscador.buscar();

		
		System.out.println("Hemos encontrado " + miBuscador.getCantidadResultados() + " Resultados para "
				+ miBuscador.getClaveBusqueda());

		if (miBuscador.hayResultados()) {

			Articulo[] articulos = miBuscador.getResultados();

			// recorrer los articulos y presentarlos en consola
			for (Articulo articulo : articulos) {
				//Polimorfismo: 
				articulo.display();
				System.err.println("-----------------------");
			}
		}
	}

}
