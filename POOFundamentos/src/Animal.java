
public abstract class Animal{
	String nombre;
	int edad;
	double peso;
	
	public Animal(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	abstract void mostrarInfo();
	


}
