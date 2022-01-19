package animales;

public class Arma {
	public static int BALAS = 6;
	
	public int municion; //Cantidad de municion que esta dentro del arma

	public Arma() {
		setMunicion(BALAS);
	}
	
	public void recargar() {
		setMunicion(this.municion + BALAS);
		
	}
	private void setMunicion(int i) {
		this.municion = i;
	}

}
