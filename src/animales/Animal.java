package animales;


public class Animal {

	//Constantes de la clase Animal
	private static int SALUD = 110;
	
	// Atributos de la clase Animal
	private int salud;
	
	public Animal(int salud) {
		setSalud(SALUD);
	}
	
	protected void setSalud(int salud) {
		this.salud=salud;
	}

	protected int getSalud(){
		return this.salud;
	}

	public void correr() {
		System.out.println("Running...");
	}
	public void comer() {
		System.out.println("Eating...");
	}

	public void perderSalud(int danno) {
		if(getSalud()-danno <=0) {
			System.out.println("Eliminado");
		}else {
			setSalud(getSalud()-danno);
			System.out.println("Salud= " + getSalud());
		}
	}
}
