package practica02;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        String nombreVendedor, vendedorMenor = "", opcion;
        double venta1, venta2, venta3, totalVentas, menorTotal = Double.MAX_VALUE;
        Scanner lectura = new Scanner(System.in);
        //Proceso de datos
        do {
            //Entrada de datos
            System.out.print("Nombre del vendedor: ");
            nombreVendedor = lectura.next();
            System.out.print("Ingrese venta 1: ");
            venta1 = lectura.nextDouble();
            System.out.print("Ingrese venta 2: ");
            venta2 = lectura.nextDouble();
            System.out.print("Ingrese venta 3: ");
            venta3 = lectura.nextDouble();
            //Calculo de datos
            totalVentas = venta1 + venta2 + venta3;
            System.out.println("Total de ventas para " + nombreVendedor + ": " + totalVentas);
            if (totalVentas < menorTotal) {
                menorTotal = totalVentas;
                vendedorMenor = nombreVendedor;
            }
            System.out.print("¿Desea registrar otro vendedor? (si/no): ");
            opcion = lectura.next();
        } while (opcion.equalsIgnoreCase("si"));
        //Salida de datos
        System.out.println("El vendedor con el menor total de ventas es: " + vendedorMenor);
        System.out.println("Total de ventas: " + menorTotal);
    }
}
