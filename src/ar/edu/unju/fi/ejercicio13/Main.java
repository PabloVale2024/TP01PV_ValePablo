package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int numero=8;
		 Scanner escaneo=new Scanner(System.in);
		 int [] numeros=new int[numero];
		 for (int i=0;i<numeros.length;i++) {
			 System.out.println("ingrese un numero entero");
			 numeros[i]=escaneo.nextInt();
		 }
		for (int i=0;i<numeros.length;i++) {
			
			System.out.println("indice: "+i);
			System.out.println("numero en Array: "+ numeros[i]);
		}
		// TODO Auto-generated method stub

	}

}
