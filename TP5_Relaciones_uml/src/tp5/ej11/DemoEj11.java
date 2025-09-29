package tp5.ej11;

public class DemoEj11 {
    public static void run() {
        System.out.println("\n-- Ej11: Reproductor-Cancion-Artista (dependencia de uso) --");
        Artista a = new Artista("Gustavo Cerati", "Rock");
        Cancion c = new Cancion("Crimen", a);

        Reproductor r = new Reproductor();
        r.reproducir(c);           // dependencia de uso: se pasa por parámetro
        r.reproducir(null);        // caso borde
    }
}
