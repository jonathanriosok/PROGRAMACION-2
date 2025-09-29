package tp5.ej1;

import java.time.LocalDate;

public class DemoEj1 {
    public static void run() {
        System.out.println("\n-- Ej1: Pasaporte-Foto-Titular --");
        Titular juan = new Titular("Juan Perez", "12345678");
        Pasaporte p = new Pasaporte("AR-001", LocalDate.of(2025, 1, 1),
                                    juan, "juan.jpg", "jpg");
        System.out.println(p);
        System.out.println(juan + " -> pasaporte: " + juan.getPasaporte().getNumero());

        p.cambiarFoto("juan_2025.png", "png");
        System.out.println("Nueva foto: " + p.getFoto());
    }
}
