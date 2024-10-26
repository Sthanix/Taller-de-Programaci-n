package sesion11;

import java.util.Random;

public class Programa04 {

    public static void main(String[] args) {
        Random random = new Random();
        double[][] ventas = new double[3][3];
        double totalVentas = 0;
        //Generacion de ventas aleatorias y calculo del total
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextDouble() * (10000 - 1000);
                totalVentas += ventas[i][j];
            }
        }
        //Calculo del promedio
        double promedioVentas = totalVentas / (3 * 3);
        //Visualizacion del total y promedio
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
    }
}
