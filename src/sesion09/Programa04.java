package sesion09;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        //Registrar los nombres
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.next();
        }
        //Búsqueda de un nombre
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscar = scanner.next();
        boolean encontrado = false;
        //Buscar y mostrar si existe o no
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("La persona " + nombreBuscar + " existe en la posición: " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La persona " + nombreBuscar + " no existe.");
        }
    }
}
