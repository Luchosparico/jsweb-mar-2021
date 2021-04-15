package ar.com.educacionit.clase2;

// nombre de la clase
public class Auto {

	// atributos
	private String marca;
	private String modelo;
	private int anio;
	private String color;
	private float velocidad;
	private float velocidadmaxima;
	private float combustible;
	private boolean encendido;

	// constructor
	public Auto() {
		// inicializar atributos de un objeto
		combustible = 0;
		encendido = false;
		anio = 2021;
		velocidad = 0;
		velocidadmaxima = 250;
	}

	// constructor parametrizado
	public Auto(String marca, String modelo, String color, float velocidadmaxima) {
		combustible = 0;
		encendido = false;
		anio = 2021;
		velocidad = 0;
		this.velocidadmaxima = velocidadmaxima;
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
	}

	// metodos
	public void encender() {
		if (!encendido) {
			encendido = true;
			System.out.println("Se ha encendido el auto");
		} else {
			System.out.println("Auto ya esta encendido");
		}
	}

	public void apagar() {
		if (encendido) {
			encendido = false;
			System.out.println("Se ha apagado el auto");
		} else {
			System.out.println("El auto ya esta apagado");
		}
	}

	public void acelerar() {
		if (encendido) {
			if (velocidad < velocidadmaxima) {
				if (combustible > 0) {
					velocidad++;
					combustible--;
				} else {
					System.out.println("No hay mas combustible");
				}
			} else {
				System.out.println("Ha llegado a la velocidad maxima");
			}
		}
	}

	public float obtenervelocidad() {
		return velocidad;
	}

	public void informarestado() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Anio: " + this.anio);
		System.out.println("Color: " + this.color);
		System.err.println("Encendido:" + this.encendido);
		System.out.println("Velocidad: " + this.velocidad);
		System.out.println("Velocidad Maxima: " + this.velocidadmaxima);
		System.out.println("Combustible: " + this.combustible);
	}
 
	// Getters / Setters
	
	public void setMarca(String marca) {
		if (marca != null) {
			//ejercicio
			this.marca = marca.toUpperCase();
		}else {
			System.out.println("Marca no puede ser null");
		}
	}
	
	public String getMarca() {
		return this.marca;
	}
	
}
