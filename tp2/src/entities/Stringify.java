package entities;

public class Stringify {

	/**
	 * Cargar un String por teclado e implementar los siguientes métodos: ● Imprimir
	 * la cantidad de caracteres que posee. ● Imprimir la primera mitad de los
	 * caracteres de la cadena. ● Imprimir el último caracter. ● Imprimirlo en forma
	 * inversa. ● Imprimir cada caracter del String separado con un guión. ●
	 * Implementar un método que verifique si la cadena posee la palabra “hola”
	 * (indistintamente si posee letras mayúsculas o minúsculas)
	 */
	
	/**
	 * 
	 * @param s String to count caracters
	 * @return String length
	 */
	public static int imprimiCantidad(String s) {
		if (s == null) {
			return 0;
		}
		return s.length();
	}
	


}
