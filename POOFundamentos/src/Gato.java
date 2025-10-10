
public class Gato extends Animal{

	String color;
	
	public Gato(String nombre, int edad, double peso, String c) {
		super(nombre, edad, peso);
		this.color=c;
	}
	
	void mostrarInfo() {
		System.out.println(this.nombre+" "+this.edad+" "+this.peso+" "+this.color);
	}

}
