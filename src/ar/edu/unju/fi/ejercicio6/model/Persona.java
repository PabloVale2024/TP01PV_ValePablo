package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	private String numeroDocumento;
	private String nombrePersona;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String numeroDocumento, String nombrePersona, LocalDate fechaNacimiento, String provincia) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public int calcularEdad(String fecha) {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/yy/aaaa");
		LocalDate fechaNaci=LocalDate.parse(fecha, formatoFecha);
		LocalDate fechaAhora = LocalDate.now();
		Period periodo = Period.between(fechaNaci, fechaAhora);
		int edad = periodo.getYears();
		return edad;
	}
	
	public boolean esMayorEdad (LocalDate fechaNac) {
		int fechaAhora = LocalDate.now().getDayOfYear();
		int fechaNacimiento = fechaNac.getDayOfYear();
		int edad = fechaAhora-fechaNacimiento;
		if (edad<17) { 
		return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Datos de Persona\n [DNI=" + numeroDocumento + ", \nNombre=" + nombrePersona + ", \nfecha de Nacimiento="
				+ fechaNacimiento + ", \nprovincia=" + provincia + ", getNumeroDocumento()=" + getNumeroDocumento()
				+ ", getNombrePersona()=" + getNombrePersona() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getProvincia()=" + getProvincia() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @param numeroDocumento
	 * @param nombrePersona
	 * @param fechaNacimiento
	 */
	public Persona(String numeroDocumento, String nombrePersona, LocalDate fechaNacimiento) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia="Jujuy";
	}
	public void mostrarDatos() {
		System.out.println("Datos de la Persona: \n");
		System.out.println("Dni: "+ this.numeroDocumento);
		System.out.println("\nNOmbre: "+ this.nombrePersona);
		System.out.println("\nFecha de Nacimiennto: "+ this.fechaNacimiento);
		System.out.println("\nProvincia: "+ this.provincia);
	if (esMayorEdad(fechaNacimiento)) {
		System.out.println("Es Mayor de Edad");
		
	}else {System.out.println("Es Menor de Edad");}
		
		
		
	}
	

}
