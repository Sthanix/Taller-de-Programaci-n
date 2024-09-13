package practica01;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        double va, i, n, vf, interes;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce el capital inicial (va): ");
        va  = lectura.nextDouble();
        System.out.print("Introduce la tasa de interés (%) (i): ");
        i = lectura.nextDouble() / 100;
        System.out.print("Introduce el periodo en meses (n): ");
        n = lectura.nextDouble();
        //Proceso de datos
        vf = va  * Math.pow((1 + i), n);
        interes = vf - va;
        //Salida de datos
        System.out.printf("El valor futuro (vf) es: %.2f\n", vf);
        System.out.printf("El interés ganado (I) es: %.2f\n", interes);
    }
}
