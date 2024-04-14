package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado;
		Scanner escaneo = new Scanner(System.in);
		System.out.println("ingrese un numero entero para iniciar");
		numeroIngresado = escaneo.nextInt();
		CalculadoraEspecial calculadora =new CalculadoraEspecial();
		
		System.out.println("La sumatoria para el numero dado es: "+calculadora.calcularSumatoria(numeroIngresado));
		System.out.println("\nEl Factorial para el numero dado es: "+calculadora.calcularFactorial(numeroIngresado));
	}

}
