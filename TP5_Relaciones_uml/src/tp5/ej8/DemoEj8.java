package tp5.ej8;

public class DemoEj8 {
    public static void run() {
        System.out.println("\n-- Ej8: Documento-FirmaDigital-Usuario --");
        Usuario u = new Usuario("Sofia Diaz", "sofia@example.com");
        Documento d = new Documento("Contrato de Servicios", "Contenido del contrato...");

        // Composición: el documento crea su propia firma internamente
        d.firmar("HASH-ABC-123", u);
        System.out.println(d);

        // Refirmar (reemplaza la firma anterior)
        d.volverAFirmar("HASH-XYZ-999", u);
        System.out.println("Re-firmado -> " + d.getFirma());
    }
}
