package animales;

import personas.Cazador;

public class Chupacabras extends Animal{
	public static int SALUD = 200;
	public static int DANNO = 15;

	public Chupacabras(){
		super(SALUD);
	}
	public Chupacabras(int salud) {
		super(salud);
	}
	
	public void embestir(Cazador cazador) {
		cazador.perderSalud(DANNO);
		System.out.println("gruuuuuggg");
	}	
	
}
