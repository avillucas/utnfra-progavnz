package entities;

public class Ventana {

	private Double numeroProduccion;
	private boolean abierta;

	public Ventana() {
		this.numeroProduccion = Math.random();
		this.abierta = false;
	}

	/**
	 * Abre la ventana 
	 */
	public void abrirla() {
		this.abierta = true;
	}

	/**
	 * Cierra la ventana 
	 */
	public void cerrarla() {
		this.abierta = false;
	}

	/**
	 * Retorna si la ventana esta cerrada
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
		Ventana ventana = (Ventana) obj;
		return (this.numeroProduccion == ventana.numeroProduccion);
	}

}
