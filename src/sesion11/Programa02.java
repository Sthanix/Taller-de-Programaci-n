package sesion11;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] compras = new double[4][4];
        double totalCompras = 0;
        //Registro de compras
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la compra [" + (i + 1) + "][" + (j + 1) + "]: ");
                compras[i][j] = scanner.nextDouble();
                totalCompras += compras[i][j];
            }
        }
        //Calculo del promedio
        double promedioCompras = totalCompras / (4 * 4);
        //Visualización del total y promedio
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}
