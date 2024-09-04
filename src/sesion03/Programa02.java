package sesion03;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        //Declarando variables
        double temperatura;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce tu temperatura corporal: ");
        temperatura = lectura.nextDouble();
        //Proceso y Salida de datos
        if (temperatura > 37.5) {
            System.out.println("Tienes fiebre.");
        } else if (temperatura < 36.0) {
            System.out.println("Tienes hipotermia.");
        } else {
            System.out.println("Tu temperatura es normal.");
        }
    }
}
