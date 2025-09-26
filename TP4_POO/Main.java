public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Juan Perez", "Gerente", 200000);
        Empleado e2 = new Empleado("Ana Lopez", "Analista");

        e1.actualizarSalario(10);  // +10%
        e2.actualizarSalario(5000); // +$5000

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
