package sesion08;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        int factorial = 1;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número entero positivo para calcular su factorial: ");
        numero = lectura.nextInt();
        //Proceso de datos
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        //Salida de datos
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
