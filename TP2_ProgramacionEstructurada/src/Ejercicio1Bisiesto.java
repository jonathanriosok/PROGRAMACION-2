import java.util.Scanner;

public class Ejercicio1Bisiesto {

    // Regla: divisible por 4 y (no por 100) o sí por 400
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }

        sc.close();
    }
}

