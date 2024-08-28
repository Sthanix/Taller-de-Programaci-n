package sesion02;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        double r, θ, radianes, x, y;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar el valor del radio (r): ");
        r = lectura.nextDouble();
        System.out.print("Ingresar el valor del ángulo (θ): ");
        θ = lectura.nextDouble();
        //Proceso de datos
        radianes = θ * (Math.PI / 180);
        x = r * Math.cos(radianes);
        y = r * Math.sin(radianes);
        //Salida de datos
        System.out.println("Las coordenadas cartesianas son: x = " + x + ", y = " + y);
    }
}
