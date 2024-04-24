package ar.edu.unju.fi.ejercicio18.main;


import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner escaneo=new Scanner(System.in);
		 ArrayList<DestinoTuristico> destinos = new ArrayList<>();
	        ArrayList<Pais> paises = new ArrayList<>(); 
	        
	        Pais pais1 = new Pais("A1","Argentina");
	        paises.add(pais1);
	        Pais pais2 = new Pais("B1","Bolivia");
	        paises.add(pais2);
	        
	        int opcion = 0;

	        do {
	            System.out.println("\nMenú de opciones:");
	            System.out.println("1 - Alta de destino turístico");
	            System.out.println("2 - Mostrar todos los destinos turísticos");
	            System.out.println("3 - Modificar el país de un destino turístico");
	            System.out.println("4 - Limpiar la lista de destinos turísticos");
	            System.out.println("5 - Eliminar un destino turístico");
	            System.out.println("6 - Mostrar destinos turísticos ordenados por nombre");
	            System.out.println("7 - Mostrar todos los países");
	            System.out.println("8 - Mostrar destinos turísticos de un país");
	            System.out.println("9 - Salir");
	            System.out.print("Ingrese una opción: ");

	            try {
	                opcion = escaneo.nextInt();
	                escaneo.nextLine(); 
	                switch (opcion) {
	                    case 1:
	                        DestinoTuristico destinoTuristico1 = new DestinoTuristico("A12","Bahia Blanca",300.98,paises.get(0),3);
	                        destinos.add(destinoTuristico1);
	                        DestinoTuristico destinoTuristico2 = new DestinoTuristico("A15","Tierra del Fuego",500.98,paises.get(0),7);
	                        destinos.add(destinoTuristico2);
	                        break;
	                    case 2:
	                    	for (DestinoTuristico dest : destinos) {
		            		         System.out.println(dest);  
		            		}
	                        break;
	                    case 3:
		                    // Modificar el país de un destino turístico
		                    break;
		                case 4:
		                    // Limpiar la lista de destinos turísticos
		                    break;
		                case 5:
		                    // Eliminar un destino turístico
		                    break;
		                case 6:
		                    // Mostrar destinos turísticos ordenados por nombre
		                    break;
		                case 7:
		                    for (Pais p : paises) {
		                    	System.out.println(p);  
		                    }
		                    break;
		                case 8:
		                    // Mostrar destinos turísticos de un país
		                	String nombreP;
		                	System.out.println("ingrese un pais");
		            		nombreP = escaneo.next();
		            		for (Pais p : paises) {
		            			if (p.getNombre() == nombreP) {
		            				
		            		     }
		            		}
		            		//System.out.println("la cantidad de jugadores de nacionalidad " + nacionalidad + "es " + cantidadN);
		            		break;
	                    case 9:
	                        System.out.println("¡Hasta pronto!");
	                        break;
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Error: Ingrese un número válido.");
	                escaneo.nextLine(); 
	            }
	        } while (opcion != 9);

	        escaneo.close();
	}
}

