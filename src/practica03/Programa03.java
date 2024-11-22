package practica03;

//Clase Cliente con el metodo get y set
class Cliente {

    private int consumo1, consumo2, consumo3, consumo4;

    public int getConsumo1() {
        return consumo1;
    }

    public void setConsumo1(int consumo1) {
        this.consumo1 = consumo1;
    }

    public int getConsumo2() {
        return consumo2;
    }

    public void setConsumo2(int consumo2) {
        this.consumo2 = consumo2;
    }

    public int getConsumo3() {
        return consumo3;
    }

    public void setConsumo3(int consumo3) {
        this.consumo3 = consumo3;
    }

    public int getConsumo4() {
        return consumo4;
    }

    public void setConsumo4(int consumo4) {
        this.consumo4 = consumo4;
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
public class Programa03 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setConsumo1(100);
        cliente.setConsumo2(200);
        cliente.setConsumo3(300);
        cliente.setConsumo4(400);
        System.out.println("Total: " + cliente.calcularTotal());
        System.out.println("Promedio: " + cliente.calcularPromedio());
        System.out.println("Mayor: " + cliente.calcularMayor());
        System.out.println("Menor: " + cliente.calcularMenor());
    }
}
