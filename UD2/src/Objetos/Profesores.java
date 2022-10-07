package Objetos;

import java.io.Serializable;

public class Profesores implements Serializable{
	//Atributos
	private String nombre;
	private int departamento;
	private Double antiguedad;
	//Constructo	
	public Profesores(String nombre, int dept, Double antiguedad) {
		super();
		this.nombre = nombre;
		this.departamento = dept;
		this.antiguedad = antiguedad;
	}
	public Profesores() {
	}
	//Getters&Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Double antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int dept) {
		this.departamento = dept;
	}
	//toString
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", antiguedad=" + antiguedad + "departamento "+departamento + "]";
	}
	
	
}