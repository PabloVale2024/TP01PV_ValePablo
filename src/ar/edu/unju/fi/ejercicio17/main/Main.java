package ar.edu.unju.fi.ejercicio17.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner escaneo=new Scanner(System.in);
	      ArrayList<Jugador> jugadores = new ArrayList<>();
	        int opcion;
	        String nombre;
    		String apellido;
    		String nacionalidad;
    		int indice;
		        do {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 – Alta de jugador");
		            System.out.println("2 – Mostrar los datos del jugador");
		            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
		            System.out.println("4 – Modificar los datos de un jugador");
		            System.out.println("5 – Eliminar un jugador");
		            System.out.println("6 – Mostrar la cantidad total de jugadores");
		            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		            System.out.println("8 – Salir");
		            System.out.print("Ingrese una opción: ");
		            opcion = escaneo.nextInt();
		            escaneo.nextLine(); 
		            try {
		            switch (opcion) {
		                case 1:
		                	String fechaString = "2000-01-01";
		                	
		                	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		                	
		                	Date fecha = sdf.parse(fechaString);
		                	
		                	Calendar calendario = Calendar.getInstance();
		               
		                	calendario.setTime(fecha);
		                	
		                	Jugador jugador = new Jugador("juan","perez",calendario,"Arg",1.8 , 65.3,""); 
		                	jugadores.add(jugador);
		                    break;
		                case 2:
		            		System.out.println("ingrese su Nombre");
		            		nombre = escaneo.next();
		            		System.out.println("ingrese su Apellido");
		            		apellido = escaneo.next();
		            		for (Jugador jug : jugadores) {
		            			if (jug.getNombre() == nombre && jug.getApellido() == apellido) {
		            		         System.out.println(jug);
		            		     }
		            		}
		                    break;
		                case 3:
		                	Comparator <Jugador> comp= Comparator.comparing(Jugador::getApellido);
		                	//comparador.s
		                	//jugadores.sort();
		                	Collections.sort(jugadores,comp);

		                    for (Jugador i : jugadores) {
		                      System.out.println(i);
		                    }
		                    break;
		                case 4:
		                	String posicion;
		                	System.out.println("ingrese su Nombre");
		            		nombre = escaneo.next();
		            		System.out.println("ingrese su Apellido");
		            		apellido = escaneo.next();
		            		for (Jugador jug : jugadores) {
		            			if (jug.getNombre() == nombre && jug.getApellido() == apellido) {
		            				indice = jugadores.indexOf(jug);
		            				System.out.println("ingrese la posicion del jugador");
				            		posicion = escaneo.next();
				            		jug.setPosicion(posicion);
				            		jugadores.set(indice, jug);
		            		     }
		            		}
		                    break;
		                case 5:
		                	System.out.println("ingrese su Nombre");
		            		nombre = escaneo.next();
		            		System.out.println("ingrese su Apellido");
		            		apellido = escaneo.next();
		            		for (Jugador jug : jugadores) {
		            			if (jug.getNombre() == nombre && jug.getApellido() == apellido) {
		            				indice = jugadores.indexOf(jug);
		            				jugadores.remove(indice);
		            		     }
		            		}
		                    break;
		                case 6:
		                	System.out.println("la cantidad de jugadores es " + jugadores.size());
		                    break;
		                case 7:
		                	int cantidadN=0;
		                	System.out.println("ingrese su nacionalidad");
		            		nacionalidad = escaneo.next();
		            		for (Jugador jug : jugadores) {
		            			if (jug.getNacionalidad() == nacionalidad) {
		            				cantidadN += 1;
		            		     }
		            		}
		            		System.out.println("la cantidad de jugadores de nacionalidad " + nacionalidad + "es " + cantidadN);
		                    break;
		                case 8:
		                    System.out.println("Saliendo del programa...");
		                    break;
		            }
		        
			        } catch (InputMismatchException e) {
			            System.out.println("Se ha introducido un valor incorrecto.");
			            escaneo.nextLine();
			        } catch (ParseException e) {
						
						 System.out.println("Se ha introducido un valor incorrecto." + e.getMessage());
				            escaneo.nextLine();
					} finally {
			            System.out.println("Fin del programa.");
			        }
		        } while (opcion != 8);
	        escaneo.close();
	    }
	}

