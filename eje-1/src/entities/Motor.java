package entities;

public class Motor {

	private Double numero;
	private Boolean prendido;
	
	
	public Motor() {
		this.numero = Math.random();
		this.prendido = false;
	}
	public void arrancar() {
		this.prendido = true;
	} 
	
	public void apagar() {
		this.prendido = false;	
	}
	
	public Boolean getPrendido() {
		return this.prendido;	
	}

	
	@Override
	public int hashCode() {
		return 15 * this.numero.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Motor motor = (Motor) obj;
		return (this.numero == motor.numero);
	}

	@Override
	public String toString() {
		return this.numero.toString();
	}
}
