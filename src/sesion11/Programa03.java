package sesion11;

import java.util.Random;

public class Programa03 {

    public static void main(String[] args) {
        Random random = new Random();
        double[][] ventas = new double[4][4];
        double mayorVenta = Double.MIN_VALUE;
        double menorVenta = Double.MAX_VALUE;
        //Generacion de ventas aleatorias y busqueda de mayor y menor venta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + random.nextDouble() * (5000 - 10);
                if (ventas[i][j] > mayorVenta) {
                    mayorVenta = ventas[i][j];
                }
                if (ventas[i][j] < menorVenta) {
                    menorVenta = ventas[i][j];
                }
            }
        }
        //Visualizacion de la mayor y menor venta
        System.out.println("La mayor venta es: " + mayorVenta);
        System.out.println("La menor venta es: " + menorVenta);
    }
}