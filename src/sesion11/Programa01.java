package sesion11;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[4][4];
        double totalVentas = 0;
        //Registro de ventas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la venta [" + (i + 1) + "][" + (j + 1) + "]: ");
                ventas[i][j] = scanner.nextDouble();
                totalVentas += ventas[i][j];
            }
        }
        //Visualización del total de las ventas
        System.out.println("El total de las ventas es: " + totalVentas);
    }
}
