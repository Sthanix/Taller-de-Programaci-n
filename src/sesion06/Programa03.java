package sesion06;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Proceso y salida de datos
        System.out.println("Introduce números (ingresa un número negativo para finalizar):");
        while (true) {
            System.out.print("Número: ");
            numero = lectura.nextInt();
            if (numero < 0) {
                break;
            }
            System.out.println("Número ingresado: " + numero);
        }
        System.out.println("Se ha finalizado la entrada de datos.");
    }
}
