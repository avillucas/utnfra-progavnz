package program;

import entities.Coche;

public class Program2 {

	public static void main(String[] args) {

		try {
			System.out.println("Intentando arrancar el coche 1 ");
			Coche coche = new Coche();
			coche.arrancar();
			System.out.println("El coche 1 arranco!!!");
		} catch (Exception error) {
			System.out.println("El coche 1 no pudo arrancar debido a que : "+error.getMessage());
		}
		try {
			System.out.println("Intentando arrancar el coche 2 ");
			Coche coche2 = new Coche();
			coche2.inflarRuedas();
			coche2.arrancar();
			System.out.println("El coche 2 arranco!!!");
		} catch (Exception error) {
			System.out.println("El coche 2 no pudo arrancar debido a que : "+error.getMessage());
		}
	}
}
