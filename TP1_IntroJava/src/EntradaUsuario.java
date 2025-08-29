import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tenes " + edad + " anios.");
        // scanner.close();  // opcional; en ejercicios simples suele omitirse
    }
}
