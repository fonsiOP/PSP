
public class HiloFonsi extends Thread{

		  private int c; // contador del hilo
		  private int numero_hilo;

		  // Constructor
		  public HiloFonsi(int numero) {
		    this.numero_hilo = numero;
		    System.out.println("Creando hilo: " + numero_hilo);
		  }

		  public void run() {
		    c = 0;
		    while (c < 5) {
		      System.out.println("Hilo número: " + numero_hilo + " Contador(c) = " + c);
		      c++;
		    }
		  }



}
