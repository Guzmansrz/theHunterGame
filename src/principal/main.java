package principal;

import animales.Chupacabras;
import personas.Cazador;

public class main {
	
	public static void main(String[] args) {
	    Cazador cazador = new Cazador(15);
	    Chupacabras chucabras = new Chupacabras();
	    cazador.disparar(chucabras);

	}

}
