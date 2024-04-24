package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		 Scanner escaneo=new Scanner(System.in);
		 System.out.println("ingrese un numero entre [3,10]");
		 numero=escaneo.nextInt();
		 int suma=0;
		 if (numero>2 && numero<11) {
		 int [] numeros=new int[numero];
		 for (int i=0;i<numeros.length;i++) {
			 System.out.println("ingrese un numero entero");
			 numeros[i]=escaneo.nextInt();
		 }
		for (int i=0;i<numeros.length;i++) {			
			System.out.println("indice: "+i);
			System.out.println("numero en Array: "+ numeros[i]);
			suma =suma+numeros[i];
			
		}
		System.out.println("suma de todos los numeros: "+ suma);
	}
		  escaneo.close();
	}
}
