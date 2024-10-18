package practica02;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        //Declarando variables
        String[] personas = new String[5];
        String nombreBuscado;
        boolean encontrado = false;
        int posicion = -1;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            personas[i] = lectura.next();
        }
        //Solicitando el nombre a buscar
        System.out.print("Ingrese el nombre que desea buscar: ");
        nombreBuscado = lectura.next();
        //Buscando en el arreglo
        for (int i = 0; i < 5; i++) {
            if (personas[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        //Salida de datos
        if (encontrado) {
            System.out.println("El nombre " + nombreBuscado + " existe en la posición " + (posicion + 1));
        } else {
            System.out.println("El nombre " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}
