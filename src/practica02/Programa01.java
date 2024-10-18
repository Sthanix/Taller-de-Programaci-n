package practica02;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        int cantidad, digitoMayor = 0, resto;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la cantidad: ");
        cantidad = lectura.nextInt();
        //Proceso de datos
        int numeroTemporal = cantidad;
        while (numeroTemporal > 0) {
            resto = numeroTemporal % 10;
            if (resto > digitoMayor) {
                digitoMayor = resto;
            }
            numeroTemporal = numeroTemporal / 10;
        }
        //Salida de datos
        System.out.println("El dígito mayor es: " + digitoMayor);
    }
}
