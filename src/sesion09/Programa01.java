package sesion09;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarando variables
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] pesos = new double[n];
        double suma = 0;
        //Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            suma += pesos[i];
        }
        //Salida de datos
        double promedio = suma / n;
        System.out.println("El peso promedio es: " + promedio);
    }
}
