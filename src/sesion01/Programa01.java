package sesion01;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarando variables
        String cliente, producto;
        double precio, cantidad, subtotal, igv, total;
        //Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre de cliente: ");
        cliente = lectura.next();
        System.out.print("Producto: ");
        producto = lectura.next();
        System.out.print("Precio: ");
        precio = lectura.nextDouble();
        System.out.print("Cantidad: ");
        cantidad = lectura.nextDouble();
        //Proceso de datos
        subtotal = precio * cantidad;
        igv = subtotal * 0.18;
        total = subtotal + igv;
        //Salida de datos
        System.out.println("Subtotal: " + subtotal + "\nIGV: " + igv + "\nTotal a pagar: " + total);
    }
}
