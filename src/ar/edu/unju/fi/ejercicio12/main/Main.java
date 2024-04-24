package ar.edu.unju.fi.ejercicio12.main;


import java.util.Calendar;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		Scanner escaneo= new Scanner(System.in);
		System.out.println("ingrese su nombre");
		nombre = escaneo.next();
		int dia;
		int mes;
		int anio;
		System.out.println("ingrese Dia de nacimiento");
		dia = escaneo.nextInt();
		System.out.println("ingrese mes de  nacimiento");
		mes = escaneo.nextInt();
		System.out.println("Ingrese año de Nacimiento");
		anio=escaneo.nextInt();
		Calendar fechaIngresada=  Calendar.getInstance();
		fechaIngresada.set(anio, mes, dia);
		Persona persona1= new Persona();
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha Nacimiento: " + dia+"/"+mes+"/"+anio);
		System.out.println("Edad: "+ persona1.calcularEdad(dia, mes, anio));
		System.out.println("Signo del Zodiaco: "+ persona1.calcualrSigno(dia, mes));
		System.out.println("Estacion de Año en que Nacio: "+persona1.estacionAnio(mes, dia));
		escaneo.close();
	}

}