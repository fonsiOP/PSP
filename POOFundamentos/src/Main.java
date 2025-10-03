import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos al ArrayList
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        // Mostrar todos los elementos
        System.out.println("Lista de frutas: " + frutas);

        
        for(int i =0;i<frutas.size();i++) {
        	frutas.get(i);
        	
        }
        
        // Acceder a un elemento por índice
        String primera = frutas.get(0);
        System.out.println("La primera fruta es: " + primera);

        // Modificar un elemento
        frutas.set(1, "Plátano");
        System.out.println("Lista después de modificar: " + frutas);

        // Eliminar un elemento
        frutas.remove("Naranja");
        System.out.println("Lista después de eliminar: " + frutas);

        // Recorrer el ArrayList con un for-each
        System.out.println("Recorriendo la lista:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Tamaño del ArrayList
        System.out.println("Número de frutas en la lista: " + frutas.size());
    }
}