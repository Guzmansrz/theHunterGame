package personas;

public class Persona {
	private int salud;
	//Resistencia por turno de cada persona, es decir, no puede hacer de todo, cada accion (recargar, moverse, disparar etc) requiere ciertos puntos de accion
	private int resistencia; 
	
	public Persona(int salud, int resistencia) {
		setSalud(salud);
		setResistencia(resistencia);
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}

	protected void setResistencia(int resistencia){
		this.resistencia=resistencia;
	}

	protected int getSalud() {
		return this.salud;
	}
	protected int getResistencia(){
		return this.resistencia;
	}
}
