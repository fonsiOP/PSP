package hilos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el nombre del primer alumno");
		String nombre1 = teclado.nextLine();
		Thread hilo1 = new Thread(new Alumno(nombre1), nombre1);
		System.out.println("Dame el nombre del segundo alumno");
		String nombre2 = teclado.nextLine();
		Thread hilo2 = new Thread(new Alumno(nombre2), nombre2);
		System.out.println("Dame el nombre del tercer alumno");
		String nombre3 = teclado.nextLine();
		Alumno alumno3 = new Alumno(nombre3);
		Thread hilo3 = new Thread(alumno3, nombre3);


		ejecutar(hilo1);
		ejecutar(hilo2);
		ejecutar(hilo3);
		
	}
	
	static void ejecutar(Thread hilo) {
		hilo.start();
		if(hilo.getName().length()<3) {
			System.out.println("El hilo no cumple el criterio");
			hilo.interrupt();
		}
		try {
			hilo.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}


}
