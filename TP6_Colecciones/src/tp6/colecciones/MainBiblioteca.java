package tp6.colecciones;

public class MainBiblioteca {

    public static void main(String[] args) {

        Autor a1 = new Autor("J. K. Rowling", "Britanica");
        Autor a2 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor a3 = new Autor("Ernesto Sabato", "Argentina");

        Libro l1 = new Libro("Harry Potter y la piedra filosofal", a1, 1997);
        Libro l2 = new Libro("Harry Potter y la camara secreta", a1, 1998);
        Libro l3 = new Libro("Cien anios de soledad", a2, 1967);
        Libro l4 = new Libro("El tunel", a3, 1948);

        Biblioteca biblio = new Biblioteca("Biblioteca Municipal");

        // agregar libros
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);
        biblio.agregarLibro(l4);

        // listar todos
        biblio.listarLibros();

        // buscar por título
        System.out.println("\n=== Buscar 'El tunel' ===");
        Libro buscado = biblio.buscarPorTitulo("El tunel");
        if (buscado != null) buscado.mostrarInfo();

        // listar por autor
        System.out.println();
        biblio.listarLibrosPorAutor("J. K. Rowling");

        // eliminar por título
        System.out.println("\n=== Eliminar 'Cien anios de soledad' y listar ===");
        biblio.eliminarLibroPorTitulo("Cien anios de soledad");
        biblio.listarLibros();
    }
}
