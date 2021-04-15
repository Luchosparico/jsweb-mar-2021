package ar.com.educacionit.clase3;

//herencia
public class Libro extends Articulo {

	//Atributos propios
	private String isbn;
	private String editorial;
	
	public Libro(String titulo, Float precio, String isbn, String editorial) {
	//tiene que nacer el padre
		super(titulo, precio); // Llamar al constructor Padre
		
		//seteo los atributos del hijo
		inicializar(isbn, editorial);
		// Alt + Shift + m ( Inicializar )
	}

	private void inicializar(String isbn, String editorial) {
		this.editorial = editorial;
		this.isbn = isbn;
	}

	public Libro(String titulo, String autor, Float precio, String isbn, String editorial) {
		super(titulo, autor, precio);
		inicializar(isbn, editorial);
		
	}
	
	// Get/Set

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

//Sobreescritura = Polimorfismo con redefinicion
	
	public void displayHijo() {
		
		System.out.println("LIBROS");			
		System.err.println("ISBN: " +this.isbn);
		System.err.println("Editorial: " +this.editorial);
	}
	
	
	
}
