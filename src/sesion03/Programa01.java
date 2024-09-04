package sesion03;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        int edad;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce tu edad: ");
        edad = lectura.nextInt();
        //Proceso y Salida de datos
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
