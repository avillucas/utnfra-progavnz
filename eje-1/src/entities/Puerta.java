package entities;

public class Puerta {
	private Double numeroProduccion;
	private boolean abierta;
	protected Ventana ventana;

	public Puerta() {
		this.numeroProduccion = Math.random();
		this.ventana = new Ventana();
		this.abierta = false;
	}

	/**
	 * Abre la puerta
	 */
	public void abrirla() {
		this.abierta = true;
	}

	/**
	 * Cierra la puerta
	 */
	public void cerrarla() {
		this.abierta = false;
	}

	/**
	 * Retorna si la puerta esta cerrada
	 * 
	 * @return boolean
	 */
	public boolean getAbierta() {
		return this.abierta;
	}

	@Override
	public String toString() {
		return this.numeroProduccion.toString();
	}

	@Override
	public int hashCode() {
		return 15 * this.numeroProduccion.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Puerta puerta = (Puerta) obj;
		return (this.numeroProduccion == puerta.numeroProduccion);
	}
}
