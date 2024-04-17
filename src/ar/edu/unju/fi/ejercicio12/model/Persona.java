package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.Date;

public class Persona {
	private String nombrePersona;
	Calendar fechaNacimiento;

public int calcularEdad(int dia, int mes, int anio) {
	Calendar hoy= Calendar.getInstance();
	int anioActual=hoy.get(Calendar.YEAR);
	Calendar fechaIngresada=  Calendar.getInstance();
			fechaIngresada.set(anio, mes, dia);
			int anioIngresado=fechaIngresada.get(Calendar.YEAR);
			int edad = anioActual-anioIngresado;
	return edad;
}

public String calcualrSigno(int dia, int mes, int anio) {
	Calendar fechaIngresada=  Calendar.getInstance();
	fechaIngresada.set(anio, mes, dia);
	
	return 
}
}
