package animales;


public class Animal {
	private int salud;
	
	public Animal(int salud) {
		setSalud(salud);
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
