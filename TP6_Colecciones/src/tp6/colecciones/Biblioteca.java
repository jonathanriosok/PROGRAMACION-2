package tp6.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    // agregarLibro(Libro l)
    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    // listarLibros()
    public void listarLibros() {
        System.out.println("=== Libros de la biblioteca " + nombre + " ===");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    // buscarPorTitulo(String titulo)
    public Libro buscarPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    // listarLibrosPorAutor(String nombreAutor)
    public void listarLibrosPorAutor(String nombreAutor) {
        System.out.println("=== Libros de " + nombreAutor + " ===");
        for (Libro l : libros) {
            if (l.getAutor().getNombre().equalsIgnoreCase(nombreAutor)) {
                l.mostrarInfo();
            }
        }
    }

    // eliminarLibroPorTitulo(String titulo)
    public boolean eliminarLibroPorTitulo(String titulo) {
        Libro l = buscarPorTitulo(titulo);
        if (l != null) {
            return libros.remove(l);
        }
        return false;
    }
}
