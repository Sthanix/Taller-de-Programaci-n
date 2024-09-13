package practica01;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        double venta1, venta2, venta3, venta4, venta5, venta6, totalVentas, promedioVentas;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce la venta del mes 1: ");
        venta1 = lectura.nextDouble();
        System.out.print("Introduce la venta del mes 2: ");
        venta2 = lectura.nextDouble();
        System.out.print("Introduce la venta del mes 3: ");
        venta3 = lectura.nextDouble();
        System.out.print("Introduce la venta del mes 4: ");
        venta4 = lectura.nextDouble();
        System.out.print("Introduce la venta del mes 5: ");
        venta5 = lectura.nextDouble();
        System.out.print("Introduce la venta del mes 6: ");
        venta6 = lectura.nextDouble();
        //Proceso de datos
        totalVentas = venta1 + venta2 + venta3 + venta4 + venta5 + venta6;
        promedioVentas = totalVentas / 6;
        // Salida de datos
        System.out.println("Total de ventas (tv): " + totalVentas);
        System.out.println("Promedio de ventas (pv): " + promedioVentas);
    }
}
