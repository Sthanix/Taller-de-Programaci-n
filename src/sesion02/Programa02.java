package sesion02;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        double lados, longitud, apotema, area;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar el número de lados del polígono: ");
        lados = lectura.nextDouble();
        System.out.print("Ingresar la longitud de un lado del polígono: ");
        longitud = lectura.nextDouble();
        //Proceso de datos
        apotema = longitud / (2 * Math.tan(Math.PI / lados));
        area = (lados * longitud * apotema) / 2;
        //Salida de datos
        System.out.println("El área del polígono regular es: " + area);
    }
}
