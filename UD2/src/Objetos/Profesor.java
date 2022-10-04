package Objetos;

import java.io.Serializable;

public class Profesor implements Serializable {
	//Atributos
	private String Nombre;
	private double antiguedad;
	
	
	//Constructor
	public Profesor() {
		
	}
	
	public Profesor(String nombre, double antiguedad) {
		super();
		Nombre = nombre;
		this.antiguedad = antiguedad;
	}
	//Getters and setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(double antiguedad) {
		this.antiguedad = antiguedad;
	}
	//Metodos
	
	
	//toString
	@Override
	public String toString() {
		return "Profesor [Nombre=" + Nombre + ", antiguedad=" + antiguedad + "]";
	}
	
	
	
}
