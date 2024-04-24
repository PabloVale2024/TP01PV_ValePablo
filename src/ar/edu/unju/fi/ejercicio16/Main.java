package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanio=5;
		 String [] nombres=new String [tamanio];
		 Scanner escaneo=new Scanner(System.in);
		 for (int i=0;i<nombres.length;i++) {
			 System.out.println("ingrese un nombre");
			 nombres[i]=escaneo.next();
		 }
		 int j=0;
		 while ( j<nombres.length) {
			 System.out.println("nombres en el Array: "+ nombres[j]);
			 j=j+1;
		 }
		 System.out.println("tamaño del Array: "+nombres.length);
		 System.out.println("ingrese indice q quiere borrar");
		 byte indiceBorrar= escaneo.nextByte();
		 int posicion=(int)indiceBorrar;
		 //String []nombresBorrados=new String[tamanio];
		 int fin=0;
		 if (posicion<nombres.length) {
			 System.out.println(posicion);
			 fin=posicion;
			 do {
				 
				 nombres[posicion-1]=nombres[posicion];
				 //System.arraycopy(nombres, posicion, nombresBorrados, 0, nombres.length-posicion);
				 fin=fin+1;
			 }while(fin==nombres.length-1);
			 
			nombres[nombres.length-1]=" ";
			 j=0;
			 while ( j<nombres.length) {
				 System.out.println("nombres en el Array: "+ nombres[j]);
				 j=j+1;
			 }
		 }else {
			 
			 if (posicion==nombres.length) {
				 nombres[posicion-1]=" ";
				 j=0;
				 while ( j<nombres.length) {
					 System.out.println("nombres en el Array: "+ nombres[j]);
					 j=j+1;
				 }
			 }else {
			 System.out.println("fuera de rango");
			 }
		 }
		 for (int i=posicion;i<nombres.length;i++) {
			 nombres[posicion]=nombres[posicion+1];
			 j=0;
			 while ( j<nombres.length) {
				 System.out.println("nombres en el Array: "+ nombres[j]);
				 j=j+1;
			 }
		 }
		  escaneo.close();
	}

}
