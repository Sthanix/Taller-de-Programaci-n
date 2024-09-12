package sesion04;

import java.util.Scanner;

public class Programa03 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        String ingles = "";
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número entre 1 y 6: ");
        numero = lectura.nextInt();
        //Proceso de datos
        switch (numero) {
            case 1:
                ingles = "one";
                break;
            case 2:
                ingles = "two";
                break;
            case 3:
                ingles = "three";
                break;
            case 4:
                ingles = "four";
                break;
            case 5:
                ingles = "five";
                break;
            case 6:
                ingles = "six";
                break;
            default:
                System.out.println("Número fuera de rango. Introduce un número entre 1 y 6.");
                return;
        }
        //Salida de datos
        System.out.println("Número en inglés: " + ingles);
    }
}
