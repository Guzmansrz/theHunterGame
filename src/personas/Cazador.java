package personas;

import animales.Arma;

public class Cazador extends Persona {
	private static int RES_CORRER = 2;
	private static int RER_RECARGAR = 1;
	private static int RES_DISPARAR = 3;

	private Arma arma;
	private int municion;

	public Cazador(int salud, int resistencia) {
		super(salud, resistencia);
	}

	public Cazador(Arma arma, int municion, int salud, int resistencia) {
		super(salud, resistencia);
		setArma(arma);
		setMunicion(municion);
	}

	private void setArma(Arma arma) {
		this.arma = arma;
	}

	protected void setMunicion(int municion) {
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
			setResistencia(RES_DISPARAR);
		}
	}

	public void correr() {
		System.out.println("Estoy corriendo");
		setResistencia(RES_CORRER);
	}
	
	public void recargarArma() {
		if(getMunicion()==0) {
			System.out.println("No tienes municion");
		}
		else {
			arma.recargar();
			setResistencia(RER_RECARGAR);
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