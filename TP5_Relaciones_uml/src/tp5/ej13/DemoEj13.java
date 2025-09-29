package tp5.ej13;

public class DemoEj13 {
    public static void run() {
        System.out.println("\n-- Ej13: GeneradorQR-CodigoQR-Usuario (dependencia de creacion) --");
        Usuario u = new Usuario("Andrea Ruiz", "andrea@example.com");

        GeneradorQR gen = new GeneradorQR();
        CodigoQR qr = gen.generar("USR-AND-2025-OK", u); // se crea adentro del método

        System.out.println(qr);
    }
}
