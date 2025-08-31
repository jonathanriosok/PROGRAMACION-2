import java.util.Scanner;

public class Ejercicio9Envio {

    // Función que calcula el costo de envío según zona y peso
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            return -1; // zona inválida
        }
    }

    // Función que calcula el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio < 0) {
            System.out.println("Zona invalida. Debe ser Nacional o Internacional.");
        } else {
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }

        sc.close();
    }
}
