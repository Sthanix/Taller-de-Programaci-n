package practica01;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        //Declarando variables
        int numero, idioma;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Introduce un número (1-6): ");
        numero = lectura.nextInt();
        System.out.print("Introduce el tipo de idioma (1=Español, 2=Inglés, 3=Portugués, 4=Francés): ");
        idioma = lectura.nextInt();
        //Proceso y salida de datos
        String traducido = "";
        switch (idioma) {
            case 1:
                switch (numero) {
                    case 1:
                        traducido = "uno";
                        break;
                    case 2:
                        traducido = "dos";
                        break;
                    case 3:
                        traducido = "tres";
                        break;
                    case 4:
                        traducido = "cuatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Número no válido";
                        break;
                }
                break;
            case 2:
                switch (numero) {
                    case 1:
                        traducido = "one";
                        break;
                    case 2:
                        traducido = "two";
                        break;
                    case 3:
                        traducido = "three";
                        break;
                    case 4:
                        traducido = "four";
                        break;
                    case 5:
                        traducido = "five";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Invalid number";
                        break;
                }
                break;
            case 3:
                switch (numero) {
                    case 1:
                        traducido = "um";
                        break;
                    case 2:
                        traducido = "dois";
                        break;
                    case 3:
                        traducido = "três";
                        break;
                    case 4:
                        traducido = "quatro";
                        break;
                    case 5:
                        traducido = "cinco";
                        break;
                    case 6:
                        traducido = "seis";
                        break;
                    default:
                        traducido = "Número inválido";
                        break;
                }
                break;
            case 4:
                switch (numero) {
                    case 1:
                        traducido = "un";
                        break;
                    case 2:
                        traducido = "deux";
                        break;
                    case 3:
                        traducido = "trois";
                        break;
                    case 4:
                        traducido = "quatre";
                        break;
                    case 5:
                        traducido = "cinq";
                        break;
                    case 6:
                        traducido = "six";
                        break;
                    default:
                        traducido = "Numéro non valide";
                        break;
                }
                break;
            default:
                traducido = "Idioma no válido";
                break;
        }
        //Salida de datos
        System.out.println("Traducido: " + traducido);
    }
}
