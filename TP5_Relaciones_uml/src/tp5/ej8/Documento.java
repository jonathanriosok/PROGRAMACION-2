package tp5.ej8;

import java.time.LocalDateTime;

// Composición: el Documento crea y administra su FirmaDigital
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composición (propiedad del documento)

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }

    // El documento "firma" creando internamente el objeto FirmaDigital (composición)
    public void firmar(String codigoHash, Usuario usuario) {
        this.firma = new FirmaDigital(codigoHash, LocalDateTime.now(), usuario);
    }

    // Si vuelve a firmarse, reemplaza la firma anterior (sigue siendo composición)
    public void volverAFirmar(String nuevoHash, Usuario usuario) {
        this.firma = new FirmaDigital(nuevoHash, LocalDateTime.now(), usuario);
    }

    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido + "', firma=" + firma + "}";
    }
}
