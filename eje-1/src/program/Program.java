package program;

import entities.Auto;
import entities.EMarca;

public class Program {
	/**
	 * 
	 * Crear un POJO llamado auto, con los siguientes atributos: patente: cadena
	 * marca: EMarca modelo: cadena percio: numérico En el main crear tres objetos y
	 * mostrarlos por pantalla. Sobrescriba el método toString, equals y hashCode.
	 * EMarca es un enumerado.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Auto auto = new Auto("AFC123", EMarca.FIAT, "Cronos", (float) 123000000);
		Auto auto2 = new Auto("REW546", EMarca.CHEVROLET, "Auto2",(float)4561230);
		Auto auto3 = new Auto("AFC125", EMarca.PEUGEOT, "208", (float) 123000000);
		Auto auto4 = new Auto("RER546", EMarca.FIAT, "Auto5",(float)4561230);
		Auto auto5 = new Auto("ARC123", EMarca.VOLKSVAGEN, "Gol trend", (float) 173000000);
		
		System.out.println(auto);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(auto4);
		System.out.println(auto5);
	}

}
