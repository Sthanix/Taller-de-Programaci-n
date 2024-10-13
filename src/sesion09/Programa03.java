package sesion09;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarando variables
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] compras = new double[n];
        double suma = 0;
        double maxCompra = Double.MIN_VALUE;
        double minCompra = Double.MAX_VALUE;
        //Procesos de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            suma += compras[i];
            if (compras[i] > maxCompra) {
                maxCompra = compras[i];
            }
            if (compras[i] < minCompra) {
                minCompra = compras[i];
            }
        }
        double promedio = suma / n;
        //Salida de datos
        System.out.println("El total de compras es: " + suma);
        System.out.println("El promedio de compras es: " + promedio);
        System.out.println("La mayor compra es: " + maxCompra);
        System.out.println("La menor compra es: " + minCompra);
    }
}
