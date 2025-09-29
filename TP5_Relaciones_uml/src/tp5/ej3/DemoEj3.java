package tp5.ej3;

public class DemoEj3 {
    public static void run() {
        System.out.println("\n-- Ej3: Libro-Autor-Editorial --");
        Autor a = new Autor("Isabel Allende", "Chile");
        Editorial e = new Editorial("Sudamericana", "CABA");
        Libro l = new Libro("La casa de los espiritus", "978-950-07-1234-5", a, e);

        System.out.println(l);

        // probamos agregación: cambiar la editorial
        l.setEditorial(new Editorial("Planeta", "CABA"));
        System.out.println("Nueva editorial: " + l.getEditorial().getNombre());
    }
}

