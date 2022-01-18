package animales;

public class Chupacabras extends Animal{
	public static int SALUD = 100;

	public Chupacabras(){
		super(SALUD);
	}
	public Chupacabras(int salud) {
		super(salud);
	}
	
	public void embestir() {
		System.out.println("gruuuuuggg");
	}	
	
}
