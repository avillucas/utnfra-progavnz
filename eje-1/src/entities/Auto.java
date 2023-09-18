package entities;

public class Auto {

	private String patente;
	private EMarca marca;
	private String modelo;
	private Float precio;

	/**
	 * 
	 * @param patente Patente del automovil 
	 * @param marca Marca del automovil
	 * @param modelo Modelo del automovil 
	 * @param precio Precio del automovil
	 */
	public Auto(String patente, EMarca marca, String modelo, Float precio) {	
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return 15*this.patente.hashCode();	
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Auto auto = (Auto) obj;
		return (this.patente ==	 auto.patente);
	}

	@Override
	public String toString() {
		return this.marca +" "+this.modelo+" ("+this.patente+") "+this.precio;
	}

}
