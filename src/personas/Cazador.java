package personas;

import animales.Arma;

public class Cazador extends Persona {
	private Arma arma;
	private int municion;

	public Cazador(int salud) {
		super(salud);
	}

	public Cazador(Arma arma, int municion, int salud) {
		super(salud);
		this.arma = arma;
		this.municion = municion;
	}

	private void setArma(Arma arma) {
		this.arma = arma;
	}

	private void setMunicion(int municion) {
		this.municion = municion;
	}

	public Arma getArma() {
		return arma;
	}

	public int getMunicion() {
		return municion;
	}

	public void disparar() {
		if (getMunicion() == 0) {
			System.out.println("No tienes municion");
		} else {
			System.out.println("PUM PUM");
			setMunicion(this.municion - 2);
		}
	}

	public void correr() {
		System.out.println("Estoy corriendo");
	}
	
	public void recargarArma() {
		if(getMunicion()==0) {
			System.out.println("No tienes municion");
		}
		else {
			arma.recargar();
		}
	}
	public void recibirGolpe(int danno) {
		if(getSalud()-danno <=0) {
			System.out.println("Has muerto.");
		}else {
			setSalud(getSalud()-danno);
			System.out.println("Tu salud es " + getSalud());
		}
	}
}