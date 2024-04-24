package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;


public class Persona {
	private String nombrePersona;
	Calendar fechaNacimiento;

	
public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

/**
	 * 
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
	 * @param nombrePersona
	 * @param fechaNacimiento
	 */
	public Persona(String nombrePersona, Calendar fechaNacimiento) {
		super();
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}
	
public int calcularEdad(int dia, int mes, int anio) {
	Calendar hoy= Calendar.getInstance();
	int anioActual=hoy.get(Calendar.YEAR);
	Calendar fechaIngresada=  Calendar.getInstance();
			fechaIngresada.set(anio, mes, dia);
			int anioIngresado=fechaIngresada.get(Calendar.YEAR);
			int edad = anioActual-anioIngresado;

	return edad;
}

public String calcualrSigno(int dia, int mes) {
	 if (mes == 1) {
         if (dia >= 21) {
             //acuario
             return "acuario";
         } else {
             //capricornio
             return "capricornio";
         }
     }
     if (mes == 2) {
         if (dia >= 19) {
             return "piscis";
         } else {
             return "acuario";
         }
     }
     if (mes == 3) {
         if (dia >= 20) {
             //acuario
             return "aries";
         } else {
             //capricornio
             return "piscis";
         }
     }
     if (mes == 4) {
         if (dia >= 20) {
             return "tauro";
         } else {
             return "Aries";
         }
     }
     if (mes == 5) {
         if (dia >= 21) {
             //acuario
             return "geminis";
         } else {
             //capricornio
             return "tauro";
         }
     }
     if (mes == 6) {
         if (dia >= 20) {
             return "cancer";
         } else {
             return "geminis";
         }
     }
     if (mes == 7) {
         if (dia >= 22) {
             //acuario
             return "leo";
         } else {
             //capricornio
             return "cancer";
         }
     }
     if (mes == 8) {
         if (dia >= 21) {
             return "virgo";
         } else {
             return "leo";
         }
     }
     if (mes == 9) {
         if (dia >= 22) {
             //acuario
             return "libra";
         } else {
             //capricornio
             return "virgo";
         }
     }
     if (mes == 10) {
         if (dia >= 22) {
             return "escorpion";
         } else {
             return "libra";
         }
     }
     if (mes == 11) {
         if (dia >= 21) {
             //acuario
             return "sagitario";
         } else {
             //capricornio
             return "escorpion";
         }
     }
     if (mes == 12) {
         if (dia >= 21) {
             return "capricornio";
         } else {
             return "sagitario";
         }
     }
     return "fecha valida"; 
}
public String estacionAnio(int mes, int dia){
	if (mes == 1 && dia >=1 && dia <=31) {
        return "Verano";
	}  else if (mes == 2 && dia>=1 && dia <= 28) {
            return "verano";	
	}else if (mes == 3 && dia >=1 && dia <=20){
		return "Verano";
	}else if (mes == 3 && dia >=21 && dia <=31){
	            return "Otoño";
	}else if (mes == 4 && dia >=1 && dia <=30){
		return "Otoño";
	}else if (mes == 5 && dia >=1 && dia <=31){
		return "otoño";
	}else if (mes == 6 && dia >=1 && dia <=20){
		return "Invierno";
	}else if (mes == 6 && dia >=21 && dia <=30){
		return "Invierno";
	}else if (mes == 7 && dia >=1 && dia <=30){
		return "Invierno";
	}else if (mes == 8 && dia >=1 && dia <=31){
		return "invierno";
	}else if (mes == 9 && dia >=1 && dia <=20){
		return "Invierno";
	}else if (mes == 9 && dia >=21 && dia <=30){
		return "Primavera";
	}else if (mes == 10 && dia >=1 && dia <=31){
		return "Priamvera";	
	}else if (mes == 11 && dia >=1 && dia <=30){
		return "Primavera";
	}else if (mes == 12 && dia >=1 && dia <=20){
		return "Verano";
	}else if (mes == 12 && dia >=21 && dia <=31){
		return "Verano";
	}return "Fecha Invalida";
}
}