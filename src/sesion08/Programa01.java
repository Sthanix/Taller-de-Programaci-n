package sesion08;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        int N;
        int suma = 0;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número entero (N): ");
        N = lectura.nextInt();
        //Proceso de datos
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        //Salida de datos
        System.out.println("La suma de los números del 1 al " + N + " es: " + suma);
    }
}
