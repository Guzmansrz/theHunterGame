package seresVivos;


public class Animal {
	private int edad;
	private String colorPelo;
	private int peso;
	private int velocidad;
	private String dieta;
	
	public Animal(int edad, String colorPelo, int peso, int velocidad, String dieta) {
		super();
		this.edad = edad;
		this.colorPelo = colorPelo;
		this.peso = peso;
		this.velocidad = velocidad;
		this.dieta = dieta;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	private void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	private void setPeso(int peso) {
		this.peso = peso;
	}

	private void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	private void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public int getEdad() {
		return edad;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public int getPeso() {
		return peso;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public String getDieta() {
		return dieta;
	}
	
	public void correr() {
		setVelocidad(40);
		System.out.println("Running...");
	}
	public void comer() {
		System.out.println("Eating...");
	}
}
