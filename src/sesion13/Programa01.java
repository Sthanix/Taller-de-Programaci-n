package sesion13;

public class Programa01 {

    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    public Programa01(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }

    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }

    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }

    public static void main(String[] args) {
        Programa01 empleado = new Programa01(3000, 500, 2000);

        System.out.println("Ahorro mensual: " + empleado.calcularAhorroMensual());
        System.out.println("Ahorro semestral: " + empleado.calcularAhorroSemestral());
        System.out.println("Ahorro anual: " + empleado.calcularAhorroAnual());
    }
}
