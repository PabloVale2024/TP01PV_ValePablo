package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner escaneo=new Scanner(System.in);
		//Pizza pizza= new Pizza();
		System.out.println("Ingrese el diametro de la pizza 20,30 0 40 cm");
		double diametro= escaneo.nextDouble();
		System.out.println("Tiene ingredentes especiales?");
		System.out.println("si / no");
	}

}
