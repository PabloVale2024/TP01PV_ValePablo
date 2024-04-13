package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner escaneo = new Scanner(System.in);
		System.out.println("ingrese datos del Empleado");
		System.out.println("ingrese Nombre");
		String nombre=escaneo.nextLine();
		System.out.println("ingrese Nuemro de legajo");
		int legajo= escaneo.nextInt();
		System.out.println("ingrese salario");
		float salario= escaneo.nextFloat();
		
		Empleado empleado1 = new Empleado(nombre, legajo, salario);
		empleado1.mostrarDatos();
		empleado1.aumentarSalario(salario);
		empleado1.mostrarDatos();

	}

}
