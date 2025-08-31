import java.util.Scanner;

public class Ejercicio5SumaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma de los numeros pares es: " + suma);

        sc.close();
    }
}
