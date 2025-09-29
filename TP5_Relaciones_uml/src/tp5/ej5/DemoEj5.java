package tp5.ej5;

public class DemoEj5 {
    public static void run() {
        System.out.println("\n-- Ej5: Computadora-PlacaMadre-Propietario --");
        Computadora pc = new Computadora("ASUS", "ROG Strix G16", "TUF-B650M", "B650");
        Propietario prop = new Propietario("Carlos Soto", "30999888");

        pc.setPropietario(prop); // vincula relación bidi
        System.out.println(pc);

        // probar composición: reemplazar la placa (se crea adentro)
        pc.reemplazarPlaca("ROG-B650E", "B650E");
        System.out.println("Placa reemplazada: " + pc.getPlacaMadre());
    }
}
