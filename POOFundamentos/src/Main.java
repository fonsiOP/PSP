import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    	Scanner teclado = new Scanner(System.in);
    	int opcion;
    	int gatoPerro;
    	String nombre;
    	int edad;
    	double peso;
    	String raza;
    	String color;
    	
    	Animal animalActual;
    	
    	ArrayList<Animal> animales = new ArrayList<>();
    	
    	
    	
    	do {
    		System.out.println("Bienvenido/a a mi refugio, selecciona que quieres hacer:");
    		System.out.println("1. Añadir animal");
    		System.out.println("2. Mostrar info animales");
    		opcion=teclado.nextInt();
    		teclado.nextLine();
    		
    		if(opcion==1) {
    			System.out.println("Introduce el nombre:");
    			nombre = teclado.nextLine();
    			System.out.println("Introduce el edad:");
    			edad = teclado.nextInt();
    			System.out.println("Introduce el peso:");
    			peso = teclado.nextInt();
    			System.out.println("Elige: 1. Gato, 2. Perro");
    			gatoPerro=teclado.nextInt();
    			teclado.nextLine();
    			if(gatoPerro==1) {
    				System.out.println("Introduce el color:");
        			color = teclado.nextLine();
        			animalActual= new Gato(nombre, edad, peso, color);
			
    			}else if(gatoPerro==2) {
    				System.out.println("Introduce la raza:");
        			raza = teclado.nextLine();
        			animalActual= new Perro(nombre, edad, peso, raza);
 
    			}else {
    				animalActual=null;
    			}
    			
    			animales.add(animalActual);

    		}
    		if(opcion==2) {
    			for(Animal animal: animales) {
    				animal.mostrarInfo();
    			}
    		}
    		
    	}while(opcion!=0);
    	
    }
}