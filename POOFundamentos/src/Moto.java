
public class Moto {
	
	// Atributos
	static String descripcion;
	private String color;
	
	// Métodos
	void pintar(String c) {
		this.color=c;
	}
	
	void printarColor() {
		System.out.println(this.color);
	}
	
	static void escribirDescripcion() {
		System.out.println(descripcion);
	}

}
