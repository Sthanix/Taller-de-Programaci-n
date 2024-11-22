package practica03;

//Clase Adicion que permite sumar diferentes cantidades de numeros
class Adicion {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int sumar(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}

//Clase principal para probar la funcionalidad de la clase Adicion
public class Programa04 {

    public static void main(String[] args) {
        Adicion adicion = new Adicion();
        System.out.println("Suma de 2 números: " + adicion.sumar(10, 20));
        System.out.println("Suma de 3 números: " + adicion.sumar(10, 20, 30));
        System.out.println("Suma de 2 números: " + adicion.sumar(10, 20, 30, 40));
        System.out.println("Suma de 3 números: " + adicion.sumar(10, 20, 30, 40, 50));
    }
}
