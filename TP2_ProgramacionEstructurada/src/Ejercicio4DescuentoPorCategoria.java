import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4DescuentoPorCategoria {

    // Devuelve el porcentaje de descuento según la categoría (A/B/C)
    public static double obtenerDescuentoPorCategoria(String categoria) {
        switch (categoria.toUpperCase(Locale.ROOT)) {
            case "A": return 0.10; // 10%
            case "B": return 0.15; // 15%
            case "C": return 0.20; // 20%
            default:  return -1;   // inválida
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine(); // limpiar salto

        System.out.print("Ingrese la categoraa del producto (A, B o C): ");
        String categoria = sc.nextLine().trim();

        double descuento = obtenerDescuentoPorCategoria(categoria);

        if (descuento < 0) {
            System.out.println("Categoria invalida. Debe ser A, B o C.");
            sc.close();
            return;
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + String.format(Locale.US, "%.2f", precio));
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + String.format(Locale.US, "%.2f", precioFinal));

        sc.close();
    }
}
