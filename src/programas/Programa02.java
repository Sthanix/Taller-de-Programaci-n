package programas;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, total, promedio;
        //Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Sueldo 4: ");
        sueldo4 = lectura.nextDouble();
        System.out.print("Sueldo 5: ");
        sueldo5 = lectura.nextDouble();
        //Proceso de datos
        total = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedio = total / 5;
        //Salida de datos
        System.out.println("Total del sueldo: " + total + "\nPromedio del sueldo: " + promedio);
    }
}
