import java.util.Scanner;

public class DivisionDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (double): ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el divisor (double): ");
        double b = sc.nextDouble();

        if (b != 0.0) {
            double resultado = a / b; // división real
            System.out.println("Resultado (double): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }
}
