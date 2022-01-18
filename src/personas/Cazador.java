package personas;

import animales.Arma;
import animales.Chupacabras;

public class Cazador extends Persona {
	private static int RES_CORRER = 2;
	private static int RES_RECARGAR = 1;
	private static int RES_DISPARAR = 3;
	public static int SALUD = 110;
	public static int RESISTENCIA = 4;

	private Arma arma;
	private int municion;

	public Cazador(int municion) {
		super(SALUD, RESISTENCIA);
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

	public void disparar(Chupacabras chucabra) {
		if (getMunicion() == 0) {
			System.out.println("No tienes municion");
		} else {
			System.out.println("PUM PUM");
			setMunicion(getMunicion() - 2);
			setResistencia(RES_DISPARAR);
			chucabra.perderSalud(12);
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
			setResistencia(RES_RECARGAR);
		}
	}
}