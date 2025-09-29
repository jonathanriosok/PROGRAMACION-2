package tp5.ej11;

// Asociación unidireccional: Cancion conoce a Artista
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }

    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', artista=" +
               (artista != null ? artista.getNombre() : "null") + "}";
    }
}
