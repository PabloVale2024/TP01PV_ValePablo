package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner escaneo = new Scanner(System.in);
		int numeroIngresado;
		System.out.println("ingrese un numero entero");
		numeroIngresado = escaneo.nextInt();
		//System.out.println(numeroIngresado);
		int resulato= numeroIngresado%2;
		//System.out.println(resulato);
		if (resulato > 0){
			System.out.println("el Numero es Impar"+ "\n" + "su Doble es: " + numeroIngresado * 2);
			}
		else { 
			System.out.println(" el numero es Par \n" + "su triple es:" + numeroIngresado * 3);
			
		}
	}

}
