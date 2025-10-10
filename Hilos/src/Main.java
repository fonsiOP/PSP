
public class Main {

		  public static void main(String[] args) {
		    for (int i = 1; i <= 3; i++) {
		      HiloFonsi h = new HiloFonsi(i); // crear hilo
		      h.start(); // iniciar hilo
		    }
		    System.out.println("3 hilos creados");
		  }
		


}
