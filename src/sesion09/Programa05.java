package sesion09;

public class Programa05 {

    public static void main(String[] args) {
        //Datos
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        int[] c = new int[a.length + b.length];
        //Proceso de datos
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
            c[index++] = b[i];
        }
        //Salida de datos
        System.out.print("Valores intercalados en el arreglo c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
