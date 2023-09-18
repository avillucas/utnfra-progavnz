package entities;

public class Rueda {

	private Double numeroProduccion;
	private boolean inflada;

	public Rueda() {
		this.numeroProduccion = Math.random();
		this.inflada = false;
	}

	/**
	 * Infla la rueda 
	 */
	public void inflar() {
		this.inflada = true;
	}

	/**
	 * Desinfla al rueda
	 */
	public void desinflar() {
		this.inflada = false;
	}

	/**
	 * @return boolean
	 */
	public boolean getInflada() {
		return this.inflada;
	}

	@Override
	public String toString() {
		return this.numeroProduccion.toString();
	}

	@Override
	public int hashCode() {
		return 15 * this.numeroProduccion.intValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Rueda rueda = (Rueda) obj;
		return (this.numeroProduccion == rueda.numeroProduccion);
	}

}
