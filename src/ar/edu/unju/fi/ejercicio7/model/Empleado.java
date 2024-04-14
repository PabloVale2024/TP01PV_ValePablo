package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String nombre;
	private int legajo;
	private float salario;
	final float SALARIO_MINIMO = 210000;
	final float AUMENTO = 20000;
	/**
	 * @param nombre
	 * @param legajo
	 * @param salario
	 */
	public Empleado(String nombre, int legajo, float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=SALARIO_MINIMO) {
		this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatos () {
		
		System.out.println("Datos de Empleado");
		System.out.println("Nombre Empleado: "+ this.nombre);
		System.out.println("Legajo: "+ this.legajo);
		System.out.println("Salario: "+ this.salario);
		
	}
	public float aumentarSalario(float salario) {
		System.out.println("aumentando salario....");
		salario = salario + AUMENTO;
		
		return salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}
	public float getAUMENTO() {
		return AUMENTO;
	}
	
	
	
	
}
