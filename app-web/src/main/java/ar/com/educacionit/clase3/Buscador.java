package ar.com.educacionit.clase3;

public class Buscador {

	// Atributos
	private String claveBusqueda;
	private Integer cantidadResultados;
	private Articulo[] resultados;

	// constructor
	public Buscador() {
		this.resultados = new Articulo[0];
		this.cantidadResultados = (0);
		this.claveBusqueda = "";
	}

	public void buscar() {
		// select * from articulos where titulos like '%this.claveBusqueda%'
		//Padre[] res = new Padre[];
		
		Libro libro = new Libro ("TONY STARK IRON MAN 01", "SCOTT DAN", 830f, "93284932849832", "PANINI");
		libro.setImagenPpal("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/3/35/IronMan-EndgameProfile.jpg/revision/latest/scale-to-width-down/310?cb=20190423175213");
		
		Libro libro2 = new Libro ("INVENCIBLE IRON MAN, EL", "BENDIS", 1525f, "827398127321", "OVNI PRESS");
		libro2.setImagenPpal("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/9/9d/Tumblr_l1iotoYo541qbn8c7.jpg/revision/latest/scale-to-width-down/250?cb=20141129031517");
		
		Pasatiempo pasatiempo = new Pasatiempo ("IRON MAN 15 CENTIMETROS", 117.99f, "ASBRO", "COD12312312");
		pasatiempo.setImagenPpal("https://static.wikia.nocookie.net/marvelcinematicuniverse/images/6/69/Tony_Stark-Suit_Test.jpg/revision/latest/scale-to-width-down/250?cb=20141129033721");
		String[] imagenesExtrasPasatiempo = new String[] {
				"https://static.wikia.nocookie.net/marvelcinematicuniverse/images/e/e9/TStark-OStane-ShutOut-IM.jpg/revision/latest/scale-to-width-down/250?cb=20170615153604",
				"https://static.wikia.nocookie.net/marvelcinematicuniverse/images/b/b4/Fucked.jpg/revision/latest/scale-to-width-down/250?cb=20130428223934"
		};
		pasatiempo.setImagenesExtras(imagenesExtrasPasatiempo);
		
		Articulo[] resultados = new Articulo[] { 
		
				libro,
				libro2,
				pasatiempo,
				new Musica ("IRON MAN INVENCIBLE 2", "BENDIS MICHAEL", 825f, "SONY MUSIC",
						new String[] {
								" 1 - Cancion 1",
								" 2 - Cancion 2",
								" 3 - Cancion 3",
								" 4 - Cancion 4"
						}), 
				new Peliculas("IRON MAN 3", 850f, "THE WALT DISNEY COMPANY", "Apta todo publico")
		};
		
		this.resultados = resultados;
		
		this.cantidadResultados = resultados.length;
	}

	public String getClaveBusqueda() {
		return this.claveBusqueda;
	}

	public void setClaveBusqueda(String claveBuscada) {
		this.claveBusqueda = claveBuscada.toUpperCase();
	}

	public Integer getCantidadResultados() {
		return this.resultados.length; // tamanio del vector
	}

	//getter que retorna los String[]
	public Articulo[] getResultados() {
		return this.resultados;
	}
	
	public boolean hayResultados() {
		return this.cantidadResultados > 0;
	}
}
