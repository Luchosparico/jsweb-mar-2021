package ar.com.educacionit.clase3;

public final class Peliculas extends Articulo {
	
	private String productora;
	private String clasificacion;
	
	
	public Peliculas(String titulo, String autor, Float precio, String productora, String clasificacion) {
		super(titulo, autor, precio);
		inicializar(productora, clasificacion);
	}

	private void inicializar(String productora, String clasificacion) {
		this.productora = productora;
		this.clasificacion = clasificacion;
	}
	
		public Peliculas(String titulo, Float precio, String productora, String clasificacion) {
			super(titulo, precio);
			inicializar(productora, clasificacion);
	}

		public String getProductora() {
			return productora;
		}

		public void setProductora(String productora) {
			this.productora = productora;
		}

		public String getClasificacion() {
			return clasificacion;
		}

		public void setClasificacion(String clasificacion) {
			this.clasificacion = clasificacion;
		}
	
		//Ctrl + Space
		@Override
		public void displayHijo() {
			System.out.println("PELICULAS");		
			System.err.println("Productora: " +this.productora);
			System.err.println("Clasificacion: " +this.clasificacion);
		}
	

}
