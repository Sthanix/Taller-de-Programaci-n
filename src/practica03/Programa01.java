package practica03;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        Scanner lectura = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaImpares = 0, cantidadPares = 0;
        //Registrando numeros en la matriz
        System.out.println("Ingresa los números para la matriz 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = lectura.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    cantidadPares++;
                } else {
                    sumaImpares += matriz[i][j];
                }
            }
        }
        //Salida de datos
        System.out.println("Suma de los números impares: " + sumaImpares);
        System.out.println("Cantidad de números pares: " + cantidadPares);
    }
}
