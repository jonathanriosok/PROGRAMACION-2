import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (int): ");
        int a = sc.nextInt();
        System.out.print("Ingresa el divisor (int): ");
        int b = sc.nextInt();

        if (b != 0) {
            int resultado = a / b; // división entera (trunca)
            System.out.println("Resultado (int): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }
}
