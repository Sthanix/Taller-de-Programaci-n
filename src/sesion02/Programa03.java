package sesion02;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        double a, b, c;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa el valor del primer cateto (a): ");
        a = lectura.nextDouble();
        System.out.print("Ingresa el valor del segundo cateto (b): ");
        b = lectura.nextDouble();
        //Proceso de datos
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //Salida de datos
        System.out.println("La longitud de la hipotenusa es: " + c);
    }
}
