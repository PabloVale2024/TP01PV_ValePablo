package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 

         Scanner escaneo = new Scanner(System.in);

         System.out.println("Ingrese un numero entero del 1 al 10 \npara calcular factorial");
         
         int numeroIngresado = escaneo.nextInt();
         
        if (numeroIngresado>0 && numeroIngresado<11) {
         int factorial=1;
         int i =1;
         while (i<=numeroIngresado) {
			//System.out.println(i);
        	 factorial=factorial*i;
			i++;
         }
		
        
             System.out.print("El Factorial de "+numeroIngresado+ " es "+factorial);
        }else {
        	
        	System.out.println("Fuera de Rango");
        }
        }   
            
	
}