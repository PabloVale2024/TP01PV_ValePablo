package ar.edu.unju.fi.ejercicio11.main;

public class Main {

	public static void main(String[] args) {
				int j=40;
				long numero=80;
				long numeroRestar = 37;
				System.out.print(numero+" ");
		for (int i=2; j>0;j--) {
			
			numero=numero + numeroRestar;
			
			System.out.print(numero+" ");
				numeroRestar=(numeroRestar-i);
		}

	}

}
