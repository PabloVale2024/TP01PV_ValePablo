package ar.edu.unju.fi.ejercicio10;

import java.util.MissingResourceException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner escaneo=new Scanner(System.in);
		//Pizza pizza= new Pizza();
		
		System.out.println("Ingrese Caracteristicas de la Pizza");
		System.out.println("Ingrese el diametro de la pizza 20,30 0 40 cm");
		double diametro= escaneo.nextDouble();
		System.out.println("Tiene ingredentes especiales?");
		System.out.println("si / no");
		String ingrediente=escaneo.next();
		boolean ingredenteEspecial;
		if (ingrediente == "si") {
			
			ingredenteEspecial= true;
		}else {
			ingredenteEspecial = false;
		}
	
		Pizza pizza = new Pizza(diametro, ingredenteEspecial);
		double area = pizza.calcularArea(diametro);
		pizza.setArea(area);
		pizza.setPrecio(pizza.calcularPrecio());
		pizza.mostrarDatos();
	}

}
