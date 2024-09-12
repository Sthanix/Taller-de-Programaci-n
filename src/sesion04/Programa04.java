package sesion04;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        //Declarando variables
        int numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número (1, 2, 3, 4, 6, 12): ");
        numero = lectura.nextInt();
        //Proceso de datos
        String periodo;
        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "número no válido";
        }
        //Salida de datos
        System.out.println("Periodo: " + periodo);
    }
}
