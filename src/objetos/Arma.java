package objetos;

public class Arma {
	public static int BALAS = 6;
	
	public int municion; //Cantidad de municion que esta dentro del arma

	public Arma() {
		setMunicion(BALAS);
	}
	
	public void recargar() {
		setMunicion(this.municion + BALAS);
		
	}
	protected void setMunicion(int municion) {
		this.municion = municion;
	}

	public void disparar(){
		setMunicion(-2);
	}

}
