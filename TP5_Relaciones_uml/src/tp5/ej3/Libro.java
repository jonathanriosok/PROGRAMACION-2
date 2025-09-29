package tp5.ej3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;         // asociación unidireccional
    private Editorial editorial; // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }

    public void setEditorial(Editorial editorial) { this.editorial = editorial; }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + "', autor=" +
               (autor != null ? autor.getNombre() : "null") +
               ", editorial=" + (editorial != null ? editorial.getNombre() : "null") + "}";
    }
}

