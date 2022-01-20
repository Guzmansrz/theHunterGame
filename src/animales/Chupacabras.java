package animales;

import personas.Cazador;

public class Chupacabras extends Animal{
	//Constantes de la clase Chupacabras
	public static int SALUD = 200;
	public static int DANNO = 15;

	public Chupacabras() {
		super(DANNO);
	}
	
	public void embestir(Cazador cazador) {
		System.out.println("gruuuuuggg");
		cazador.perderSalud(DANNO);
	}
	
	public void chuparCabra(Animal animal){
		System.out.println("ÑAAAAM");
		animal.perderSalud(DANNO);
	}
}
