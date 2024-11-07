package sesion12;

public class Programa02 {

    private double compra1, compra2, compra3, compra4;

    public Programa02(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    public double calcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }

    public double calcularPromedio() {
        return calcularTotal() / 4;
    }

    public double calcularMayor() {
        return Math.max(Math.max(compra1, compra2), Math.max(compra3, compra4));
    }

    public double calcularMenor() {
        return Math.min(Math.min(compra1, compra2), Math.min(compra3, compra4));
    }

    public static void main(String[] args) {
        Programa02 compras = new Programa02(120.50, 300.00, 90.75, 450.00);

        System.out.println("Total de compras: " + compras.calcularTotal());
        System.out.println("Promedio de compras: " + compras.calcularPromedio());
        System.out.println("Compra mayor: " + compras.calcularMayor());
        System.out.println("Compra menor: " + compras.calcularMenor());
    }
}
