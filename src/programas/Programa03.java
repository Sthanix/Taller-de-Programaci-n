package programas;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        String empleado;
        double ingreso, gasto, ahorrom, ahorrob, ahorros, ahorroa;
        //Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre del empleado: ");
        empleado = lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso = lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto = lectura.nextDouble();
        //Proceso de datos
        ahorrom = ingreso - gasto;
        ahorrob = ahorrom * 2;
        ahorros = ahorrom * 6;
        ahorroa = ahorrom * 12;
        //Salida de datos
        System.out.println("Ahorro mensual: " + ahorrom + "\nAhorro bimestral: "
                + ahorrob + "\nAhorro semestral: " + ahorros + "\nAhorro anual: " + ahorroa);
    }
}
