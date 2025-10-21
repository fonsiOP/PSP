package hilos;

public class Alumno implements Runnable{
	
	String frase;
	
	Alumno(String nombre){
		this.frase="Hola soy "+ nombre + " y este es mi mensaje número: ";
	}

	@Override
	public void run() {
		int i=1;
		while(i<6) {
			System.out.println(this.frase+i);
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				i=6;
			}
		}
		
		
	}

}
