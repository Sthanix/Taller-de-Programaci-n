package sesion06;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        int contador = 0;
        int numeroEspecifico = 5;
        Scanner lectura = new Scanner(System.in);
        //Proceso de datos
        System.out.println("Introduce números (ingresa -1 para finalizar):");
        while (true) {
            System.out.print("Número: ");
            numero = lectura.nextInt();
            if (numero == -1) {
                break;
            }
            if (numero == numeroEspecifico) {
                contador++;
            }
        }
        //Salida de datos
        System.out.println("El número " + numeroEspecifico + " fue ingresado " + contador + " veces.");
    }
}
