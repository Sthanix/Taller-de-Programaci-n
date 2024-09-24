package sesion06;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        int suma = 0;
        Scanner lectura = new Scanner(System.in);
        //Proceso de datos
        System.out.println("Introduce números para sumar (ingresa 0 para finalizar):");
        while (true) {
            System.out.print("Número: ");
            numero = lectura.nextInt();
            if (numero == 0) {
                break;
            }
            suma += numero;
        }
        //Salida de datos
        System.out.println("La suma total es: " + suma);
    }
}
