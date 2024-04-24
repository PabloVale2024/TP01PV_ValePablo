package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero;
		 Scanner escaneo=new Scanner(System.in);
		 System.out.println("ingrese un numero entre [5,10]");
		 numero=escaneo.nextInt();
		 String [] nombres=new String [numero];
		 if (numero>4 && numero<11) {
		 for (int i=0;i<nombres.length;i++) {
			 System.out.println("ingrese un nombre");
			 nombres[i]=escaneo.next();
		 }
		for (int j=nombres.length-1;j>=0;j--) {			
			System.out.println("indice: "+j);
			System.out.println("nombre en Array: "+ nombres[j]);
			
		}

	}else {
		System.out.println("Numero fuera de Rango");
	}
		  escaneo.close();
	}

}
