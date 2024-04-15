package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private double diametro;
	private double precio;
	private double area;
	private boolean ingredentesEspeciales;
	
	public final int ESEPCIAL20 = 500;
	public final int ESEPCIAL30 = 750;
	public final int ESEPCIAL40 = 1000;
	
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param diametro
	 * @param precio
	 * @param area
	 * @param ingredentesEspeciales
	 */
	public Pizza(double diametro, double precio, double area, boolean ingredentesEspeciales) {
		super();
		this.diametro = diametro;
		this.precio = precio;
		this.area = area;
		this.ingredentesEspeciales = ingredentesEspeciales;
	}

	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredentesEspeciales() {
		return ingredentesEspeciales;
	}
	public void setIngredentesEspeciales(boolean ingredentesEspeciales) {
		this.ingredentesEspeciales = ingredentesEspeciales;
	}
	public double calcularPrecio() {
		double precio = 0;
		
		if (diametro == 20 && ingredentesEspeciales) {
			precio = 4500 + ESEPCIAL20;
		}else {
			if (diametro == 20 && !ingredentesEspeciales) {
				precio= 4500;
			}else {
				if (diametro == 30 && !ingredentesEspeciales) {
					precio= 4800;
					
				}else {
					if (diametro == 30 && ingredentesEspeciales) {
						precio= 4800 + ESEPCIAL30;
					}else {
						if (diametro == 40 && !ingredentesEspeciales) {
							precio= 5500;
						}else {
							if (diametro == 400 && ingredentesEspeciales) {
								precio= 5500 + ESEPCIAL40;
							}
						}
					}
				}
				
			}
		}
		return precio;
		
	}
	public double calcularArea(float diametro) {
		double pi =3.14f;
		double area;
		return  area= (double) (pi * Math.pow(diametro/2, 2));
	}
	public void mostrarDatos() {
		System.out.println("##Pizza 1###");
		System.out.println("Diametro = "+this.diametro);
		System.out.println("Ingredientes  = "+this.ingredentesEspeciales);
		System.out.println("Precio = "+this.precio);
		System.out.println("Diametro = "+this.area);
		
	}
}
