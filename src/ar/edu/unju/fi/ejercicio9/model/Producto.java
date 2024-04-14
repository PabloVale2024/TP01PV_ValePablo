package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private int descuento;
	/**
	 * 
	 */
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param descuento
	 */
	public Producto(String nombre, int codigo, float precio, int descuento) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public float calcularDescuento(float precio,int descuento) {
		if (descuento>0 && descuento<51) {
		float precioDescuento =  (precio -(precio * ((float)descuento/100)));
		return precioDescuento;
		}else {
			System.out.println("Descuento fuera de Rango");
			return precio;
		}
	}
	public void mostrarDatos() {
		System.out.println("Nombre Producto: "+this.nombre);
		System.out.println("Codigo Producto: "+this.codigo);
		System.out.println("Precio Producto: $"+this.precio);
		System.out.println("Descuento: % "+this.descuento);
		System.out.println("Precio con descuento: $"+calcularDescuento(this.precio, this.descuento)+"\n");
		
	}

}
