package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaneo = new Scanner(System.in);

        System.out.println("Ingrese un numero entero del 1 al 9 \npara mostrar su tabla \nde multiplicar");
        
        int numeroIngresado = escaneo.nextInt();
        
       if (numeroIngresado>0 && numeroIngresado<10) {
        int producto=0;
       
        for (int i= 0;i<=numeroIngresado;i++) {
			//System.out.println(i);
			producto =numeroIngresado *i;
       	System.out.println("| "+numeroIngresado + " x "+i+" = "+producto+" |");
        }
        
       }else System.out.println("Numero Fuera de rango");
	}

}
