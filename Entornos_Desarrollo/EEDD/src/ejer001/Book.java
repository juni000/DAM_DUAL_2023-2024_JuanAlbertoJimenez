package ejer001;

public class Book {
	// atributos
	
	private String titulo;
	private String isbn;
	private int numpag;
	
	// constructor
	
	Book() {

	}
	public Book(String titulo, String isbn, int numpag) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.numpag = numpag;
	}
	// metodos... getter y setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumpag() {
		return numpag;
	}

	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}
	
	public void visualizar() {
		System.out.println("----------------------");
		System.out.println("Titulo: " + titulo);
		System.out.println("Paginas: " + numpag);
		System.out.println("ISBN: " + isbn);
		System.out.println("----------------------");
		
	}

}
