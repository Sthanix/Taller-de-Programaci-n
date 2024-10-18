package practica02;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        double[] compras = new double[12];
        double totalCompras = 0, menorCompra = Double.MAX_VALUE, promedioCompras;
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int mesMenorCompra = 0;
        Scanner lectura = new Scanner(System.in);
        //Entrada y proceso de datos
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la compra del mes de " + nombresMeses[i] + ": ");
            compras[i] = lectura.nextDouble();
            totalCompras += compras[i];
            if (compras[i] < menorCompra) {
                menorCompra = compras[i];
                mesMenorCompra = i;
            }
        }
        promedioCompras = totalCompras / 12;
        //Salida de datos
        System.out.println("Total de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
        System.out.println("La menor compra fue en el mes de " + nombresMeses[mesMenorCompra] + " con un valor de: " + menorCompra);
    }
}
