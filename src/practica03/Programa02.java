package practica03;

//Clase Cliente con el metodo constructor
class Cliente {

    private int consumo1, consumo2, consumo3, consumo4;

    public Cliente(int c1, int c2, int c3, int c4) {
        this.consumo1 = c1;
        this.consumo2 = c2;
        this.consumo3 = c3;
        this.consumo4 = c4;
    }

    public int calcularTotal() {
        return consumo1 + consumo2 + consumo3 + consumo4;
    }

    public double calcularPromedio() {
        return calcularTotal() / 4.0;
    }

    public int calcularMayor() {
        return Math.max(Math.max(consumo1, consumo2), Math.max(consumo3, consumo4));
    }

    public int calcularMenor() {
        return Math.min(Math.min(consumo1, consumo2), Math.min(consumo3, consumo4));
    }
}

//Clase principal para probar la funcionalidad de la clase Cliente
public class Programa02 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(100, 200, 300, 400);
        System.out.println("Total: " + cliente.calcularTotal());
        System.out.println("Promedio: " + cliente.calcularPromedio());
        System.out.println("Mayor: " + cliente.calcularMayor());
        System.out.println("Menor: " + cliente.calcularMenor());
    }
}
