package practica01;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldo, promedioSueldo, sueldoMenor;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce el sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Introduce el sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Introduce el sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Introduce el sueldo 4: ");
        sueldo4 = lectura.nextDouble();
        System.out.print("Introduce el sueldo 5: ");
        sueldo5 = lectura.nextDouble();
        //Proceso de datos
        totalSueldo = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedioSueldo = totalSueldo / 5;
        sueldoMenor = sueldo1;
        if (sueldo2 < sueldoMenor) {
            sueldoMenor = sueldo2;
        }
        if (sueldo3 < sueldoMenor) {
            sueldoMenor = sueldo3;
        }
        if (sueldo4 < sueldoMenor) {
            sueldoMenor = sueldo4;
        }
        if (sueldo5 < sueldoMenor) {
            sueldoMenor = sueldo5;
        }
        //Salida de datos
        System.out.println("Total sueldo: " + totalSueldo);
        System.out.println("Promedio sueldo: " + promedioSueldo);
        System.out.println("Sueldo menor: " + sueldoMenor);
    }
}
