package sesion04;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        String palabra = "";
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número entre 1 y 5: ");
        numero = lectura.nextInt();
        //Proceso de datos
        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                System.out.println("Número fuera de rango.");
                return;
        }
        //Salida de datos
        System.out.println("Número: " + numero + ", Palabra: " + palabra);
    }
}
