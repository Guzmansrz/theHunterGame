package seresVivos;

public class Persona {
	private int salud;
	
	public Persona(int salud) {
		super();
		setSalud(salud);
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}

	protected int getSalud() {
		return this.salud;
	}
}
