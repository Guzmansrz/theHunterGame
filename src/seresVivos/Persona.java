package seresVivos;

public class Persona {

	private int edad;
	private String genero;
	private int altura;
	
	public Persona(int edad, String genero, int altura) {
		super();
		this.edad = edad;
		this.genero = genero;
		this.altura = altura;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	private void setGenero(String genero) {
		this.genero = genero;
	}

	private void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public String getGenero() {
		return genero;
	}

	public int getAltura() {
		return altura;
	}
	
}
