package tp5.ej11;

public class Reproductor {
    // Dependencia de uso: la Cancion llega como parámetro; no se guarda como atributo
    public void reproducir(Cancion cancion) {
        if (cancion == null) {
            System.out.println("No hay cancion para reproducir.");
            return;
        }
        String artista = (cancion.getArtista() != null) ? cancion.getArtista().getNombre() : "Artista desconocido";
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + artista);
    }
}
