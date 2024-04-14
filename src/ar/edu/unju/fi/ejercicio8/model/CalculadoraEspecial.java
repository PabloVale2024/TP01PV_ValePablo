package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int numeroInicio;
	
		
	/**
	 * 
	 */
	public CalculadoraEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getNumeroInicio() {
		return numeroInicio;
	}


	public void setNumeroInicio(int numeroInicio) {
		this.numeroInicio = numeroInicio;
	}


	/**
	 * @param numeroInicio
	 */
	public CalculadoraEspecial(int numeroInicio) {
		super();
		this.numeroInicio = numeroInicio;
	}


	public int calcularSumatoria(int numeroFinal) {
		int sumatoria=0;
				//if (0<numeroFinal) {
					for (int i=1;i<=numeroFinal;i++) {
						sumatoria=sumatoria+i;
					}
					return sumatoria;
										
	}
	public int calcularFactorial(int numeroN) {
		int producto=1;
		for (int i=1;i<=numeroN;i++) {
			producto=producto*i;
		}return producto;
	}
	

	
}
