package tp5.ej6;

public class DemoEj6 {
    public static void run() {
        System.out.println("\n-- Ej6: Reserva-Cliente-Mesa --");
        Cliente cli = new Cliente("Lucia Rios", "343-555123");
        Mesa m1 = new Mesa(7, 4);
        Reserva r = new Reserva("2025-10-01", "20:30", cli, m1);

        System.out.println(r);

        // Probar agregación: cambiar la mesa
        r.cambiarMesa(new Mesa(12, 2));
        System.out.println("Mesa cambiada -> " + r.getMesa());
    }
}
