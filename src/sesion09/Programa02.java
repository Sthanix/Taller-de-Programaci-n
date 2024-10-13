package sesion09;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarando variables
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] ingresos = new double[n];
        double suma = 0;
        double maxIngreso = 0;
        //Proceso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            suma += ingresos[i];
            if (ingresos[i] > maxIngreso) {
                maxIngreso = ingresos[i];
            }
        }
        //Salida de datos
        double promedio = suma / n;
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El ingreso mayor es: " + maxIngreso);
    }
}
