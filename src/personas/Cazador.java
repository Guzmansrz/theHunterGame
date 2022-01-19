package personas;

import animales.Arma;
import animales.Chupacabras;

public class Cazador extends Persona {
	private static int RES_CORRER = 2;
	private static int RES_RECARGAR = 1;
	private static int RES_DISPARAR = 3;
	public static int SALUD = 110;
	public static int RESISTENCIA = 4;
	private static int MUNICION = 100;

	private Arma arma;
	private int municion;

	public Cazador() {
		super(SALUD, RESISTENCIA);
		Arma defaultArma = new Arma();
		setArma(defaultArma);
		setMunicion(MUNICION);
	}

	protected void setMunicion(int municion) {
		this.municion = municion;
	}

	public Arma getArma() {
		return arma;
	}
	
	private void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getMunicion() {
		return municion;
	}

	public void disparar(Chupacabras chucabra) {
		if (getMunicion() == 0) {
			System.out.println("No tienes munición");
		} else {
			System.out.println("PUM");
			setMunicion(getMunicion() - 1);
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
			this.municion = municion - Arma.BALAS;
			setResistencia(RES_RECARGAR);
		}
	}
}