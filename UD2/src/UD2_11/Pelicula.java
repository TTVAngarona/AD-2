package UD2_11;

public class Pelicula {
	//TAGS
	private int id;
	private String titulo;
	private int anyo;
	private String descripcion;
	//CONSTRUCTOR
	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, int anyo, String descripcion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anyo = anyo;
		this.descripcion = descripcion;
	}

	
	
	//GETTERS&SETTERS
	/*****Id****/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/****Titulo****/
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/*****Anyo****/
	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	/*****Descripcion****/
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//Metodos
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", anyo=" + anyo + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
}
