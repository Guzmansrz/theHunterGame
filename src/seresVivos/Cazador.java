package seresVivos;

public class Cazador extends Persona {
	private Arma arma;
	private int municion;
	private int resistencia;
	private int salud;

	public Cazador(int edad, String genero, int altura) {
		super(edad, genero, altura);
		// TODO Auto-generated constructor stub
	}

	public Cazador(int edad, String genero, int altura, Arma arma, int municion, int resistencia, int salud) {
		super(edad, genero, altura);
		this.arma = arma;
		this.municion = municion;
		this.resistencia = resistencia;
		this.salud = salud;
	}

	private void setArma(Arma arma) {
		this.arma = arma;
	}

	private void setMunicion(int municion) {
		this.municion = municion;
	}

	private void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	private void setSalud(int salud) {
		this.salud = salud;
	}

	public Arma getArma() {
		return arma;
	}

	public int getMunicion() {
		return municion;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getSalud() {
		return salud;
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
			System.out.println("No puedes recargar porque no tienes municion");
		}
		else {
			arma.recargar();
		}
	}
	public void recibirDanno(int danno) {
		if(getSalud()-danno <=0) {
			System.out.println("Has muerto.");
		}else {
			setSalud(this.salud-danno);
			System.out.println("Tu salud es " + getSalud());
		}
	}
}