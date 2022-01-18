package seresVivos;

public class Arma {

	public int municionCargador;
	public boolean encasquillado;
	public void recargar() {
		setMunicionCargador(this.municionCargador+6);
		
	}
	private void setMunicionCargador(int i) {
		this.municionCargador=i;
		
	}

}
