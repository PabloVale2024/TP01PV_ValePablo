package ar.edu.unju.fi.ejercicio17.model;

import java.util.Calendar;

public class Jugador {
	private String nombre;
	private String apellido;
	Calendar fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	  public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, double estatura, double peso, String posicion) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.fechaNacimiento = fechaNacimiento;
	        this.nacionalidad = nacionalidad;
	        this.estatura = estatura;
	        this.peso = peso;
	        this.posicion = posicion;
	    }
	
	public int calcularEdad(Calendar fechaNacimiento) {
		Calendar hoy= Calendar.getInstance();
		int anioActual=hoy.get(Calendar.YEAR);
				int anioJugador=fechaNacimiento.get(Calendar.YEAR);
				int edad = anioActual-anioJugador;

		return edad;
	}
}
