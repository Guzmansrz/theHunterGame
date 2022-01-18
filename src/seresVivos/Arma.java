package seresVivos;

public class Arma {

	public int municionCargador; //Cantidad de municion que esta dentro del arma

	public void recargar() {
		setMunicionCargador(this.municionCargador+6);
		
	}
	private void setMunicionCargador(int i) {
		this.municionCargador=i;
		
	}

}
