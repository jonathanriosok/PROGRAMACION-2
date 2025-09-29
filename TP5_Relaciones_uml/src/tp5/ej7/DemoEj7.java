package tp5.ej7;

public class DemoEj7 {
    public static void run() {
        System.out.println("\n-- Ej7: Vehiculo-Motor-Conductor --");
        Motor m = new Motor("naftero", "SN-001-A");
        Vehiculo v = new Vehiculo("AE123AB", "Toyota", "Corolla", m);
        Conductor cond = new Conductor("Nicolas Perez", "B1-AR-998877");

        v.setConductor(cond); // vincula bidi
        System.out.println(v);

        // probar agregación: cambiar motor
        v.setMotor(new Motor("hibrido", "SN-002-H"));
        System.out.println("Motor reemplazado: " + v.getMotor());
    }
}
