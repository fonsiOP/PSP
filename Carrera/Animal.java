
public class Animal implements Runnable{


	// Arributos
	int distancia;
	int velocidad;
	String nombre;
	
	// Métodos
	public void run() {
		this.correr();		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	Animal(String n){
		this.nombre=n;
		this.distancia=0;
	}
	public void correr() {	
 
	}
	
	public void decirDatos() {
		System.out.println(this.nombre + "está a una distancia de: " + this.distancia + "metros.");
		
	}

}
