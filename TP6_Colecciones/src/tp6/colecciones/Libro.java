package tp6.colecciones;

public class Libro {
    private String titulo;
    private Autor autor;      // composición: un libro tiene un autor
    private int anio;

    public Libro(String titulo, Autor autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public void mostrarInfo() {
        System.out.println("Libro { titulo='" + titulo +
                "', autor=" + autor +
                ", anio=" + anio + " }");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anio=" + anio +
                '}';
    }
}
