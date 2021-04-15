package ar.com.educacionit.clase3;

public class AtributoClaseMain {

	public static void main(String[] args) {


		Libro l = new Libro ("TONY STARK IRON MAN 01", "SCOTT DAN", 830f, "93284932849832", "PANINI"); 
		Pasatiempo p = new Pasatiempo ("IRON MAN 15 CENTIMETROS", 117.99f, "ASBRO", "COD12312312");
		
		//Atributo de instancia
		//Objeto.Metodo-Atributo
		String tipoL = l.tipo;
		String tipoP = p.tipo;
		
		//clase.atributo-metodo  ---- Accede a un atributo de Clase
		String tipoA = Articulo.tipo;
	}

}
