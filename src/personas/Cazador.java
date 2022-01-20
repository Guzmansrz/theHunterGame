package personas;

import animales.Chupacabras;
import objetos.Arma;

public class Cazador extends Persona {

	//Constantes de la clase Cazador
	private static int RES_CORRER = 2;
	private static int RES_RECARGAR = 1;
	private static int RES_DISPARAR = 3;
	public static int SALUD = 110;
	public static int RESISTENCIA = 4;
	private static int MUNICION = 100;

	//Atributos de la clase Cazador
	private Arma arma;
	private int municion;

	public Cazador() {
		super(SALUD, RESISTENCIA);
		Arma defaultArma = new Arma();
		setArma(defaultArma);
		setMunicion(MUNICION);
	}
	// Getters y Setters de la clase Cazador
	public int getMunicion() {
		return municion;
	}

	protected void setMunicion(int municion) {
		this.municion = municion;
	}

	public Arma getArma() {
		return this.arma;
	}
	
	private void setArma(Arma arma) {
		this.arma = arma;
	}
	/**
	 * Metodo DISPARAR que permite al objeto cazador inflingir da�o al Chupacabras,
	 * Si no le queda municion al cazador no puede disparar, si tuviera dispara una bala,
	 * La cual se le resta de la municion del arma.
	 * @param chucabras
	 */
	public void disparar(Chupacabras chupacabras) {
		if (getMunicion() == 0) {
			System.out.println("No tienes municion");
		} else {
			System.out.println("PUM");
			getArma().disparar();
			setResistencia(RES_DISPARAR);
			chupacabras.perderSalud(12);
		}
	}

	public void moverse() {
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