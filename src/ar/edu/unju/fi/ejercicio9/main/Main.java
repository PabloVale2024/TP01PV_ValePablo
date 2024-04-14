package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaneo = new Scanner(System.in);
		for (int i=1; i<4;i++){
			System.out.println("ingrese datos del producto: "+i);
			System.out.println("ingrese nombre del producto: ");
			String nombre = escaneo.next();
			System.out.println("ingrese codigo del producto: ");
			int codigo = escaneo.nextInt();
			System.out.println("ingrese precio del producto: ");
			float precio = escaneo.nextFloat();
			System.out.println("ingrese descuento [0 % al 50 %] del producto: ");
			int descuento= escaneo.nextInt();
			Producto producto= new Producto(nombre, codigo,precio, descuento);
			//System.out.println(producto.calcularDescuento(precio, descuento));
			producto.mostrarDatos();
		}
	}

}
