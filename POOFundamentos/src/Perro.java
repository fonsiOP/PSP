
public class Perro extends Animal{

	String raza;
	
	public Perro(String nombre, int edad, double peso, String r) {
		super(nombre, edad, peso);
		this.raza=r;
		
	}

	@Override
	void mostrarInfo() {
		System.out.println(this.nombre+" "+this.edad+" "+this.peso+" "+this.raza);
		
	}
	


}
