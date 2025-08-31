public class Ejercicio13RecursivoArray {

    // Función recursiva para imprimir el array
    public static void imprimirArray(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirArray(array, indice + 1); // llamada recursiva
        }
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Imprimir precios originales
        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        // c. Modificar un precio (ejemplo: índice 2 → tercer producto)
        precios[2] = 129.99;

        // d. Imprimir precios modificados
        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }
}
