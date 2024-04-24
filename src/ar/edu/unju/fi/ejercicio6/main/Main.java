package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Persona persona1 = new Persona();
		System.out.println("Datos de persona 1 ");
		//System.out.println (persona1.toString());
		Scanner scaneo =new Scanner(System.in);
		System.out.println("ingrese dni ");
		String dni= scaneo.nextLine();
		System.out.println("ingrese nombre");
		String nombre = scaneo.nextLine();
		System.out.println("ingrese fecha nacimiento DD/MM/AAAA");
		String fechaescaneada = scaneo.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechaescaneada, formato);
		System.out.println("ingrese Provincia");
		String provincia = scaneo.nextLine();
		
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.mostrarDatos();
		
		//System.out.println(anioAhora-anio);
		//if esMayorEdad(fechaNacimiento) {
			
			//System.out.println("es mayor de Edad");
		//}
		//System.out.println(persona2.toString());
		scaneo.close();
	}

}
