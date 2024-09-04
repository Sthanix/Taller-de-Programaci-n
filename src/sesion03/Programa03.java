package sesion03;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        double calificacion;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce la calificación del estudiante: ");
        calificacion = lectura.nextDouble();
        //Proceso y Salida de datos
        if (calificacion >= 16) {
            System.out.println("El estudiante ha aprobado con excelente desempeño.");
        } else if (calificacion >= 12) {
            System.out.println("El estudiante ha aprobado.");
        } else if (calificacion >= 10) {
            System.out.println("El estudiante necesita mejorar.");
        } else {
            System.out.println("El estudiante ha reprobado.");
        }
    }
}
