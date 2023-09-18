package entities;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Coche: con un motor, cuatro ruedas y dos puertas; con los métodos: Arrancar
 * (chequea que las puertas estén cerradas, que las ruedas estén infladas y
 * arranca el motor. Si falla algo, se deberá informar lo ocurrido por consola),
 * Parar (chequea que el coche este andando, apaga el motor, abre las puertas y
 * cierra las ventanas. Si falla algo, se deberá informar lo ocurrido por
 * consola) y control (debe informar el estado de las ruedas).
 */
public class Coche {
	private Double numeroChasis;
	private Motor motor;
	protected Collection<Rueda> ruedas;
	protected Collection<Puerta> puertas;

	public Coche() {
		this.numeroChasis = Math.random();
		this.motor = new Motor();
		this.puertas = new LinkedList<Puerta>();
		this.puertas.add(new Puerta());
		this.puertas.add(new Puerta());
		this.ruedas = new LinkedList<Rueda>();
		this.ruedas.add(new Rueda());
		this.ruedas.add(new Rueda());
		this.ruedas.add(new Rueda());
		this.ruedas.add(new Rueda());
	}

	/**
	 * Infla las ruedas
	 */
	public void inflarRuedas() {
		for (Rueda r : this.ruedas) {
			r.inflar();
		}
	}

	/**
	 * Arranca el auto (chequea que las puertas estén cerradas, que las ruedas estén
	 * infladas y arranca el motor. Si falla algo, se deberá informar lo ocurrido
	 * por consola
	 * 
	 * @throws Exception
	 */
	public void arrancar() throws Exception {
		for (Puerta p : this.puertas) {
			if (p.getAbierta() == true) {
				throw new Exception("Una puerta se encuentra abierta, debe cerrarla para arrancar");
			}
		}
		for (Rueda r : this.ruedas) {
			if (r.getInflada() == false) {
				throw new Exception("Una de las ruedas esta desinflada, debe inflarla para arrancar");
			}
		}
		this.motor.arrancar();
	}

	/**
	 * Parar (chequea que el coche este andando, apaga el motor, abre las puertas y
	 * cierra las ventanas. Si falla algo, se deberá informar lo ocurrido por
	 * consola)
	 * 
	 * @throws Exception
	 */

	public void parar() throws Exception {
		if (this.motor.getPrendido() == false) {
			throw new Exception("El motor ya esta apagado");
		}
		for (Puerta p : this.puertas) {
			p.abrirla();
			p.ventana.cerrarla();
		}
		this.motor.apagar();
	}

	/**
	 * control (debe informar el estado de las ruedas).
	 */
	public String control() {
		int infladas = 0;
		for (Rueda r : this.ruedas) {
			if (r.getInflada() == true) {
				infladas++;
			}
		}
		return String.format(" %d ruedas estan desinfaldas", infladas);
	}

	@Override
	public String toString() {
		return this.numeroChasis.toString();
	}

	@Override
	public int hashCode() {
		return 15 * this.numeroChasis.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Coche coche = (Coche) obj;
		return (this.numeroChasis == coche.numeroChasis);
	}
}
