package tp3_poo;

public class Main {
    public static void main(String[] args) {
        
        // -------------------------------
        // 1. Registro de Estudiantes
        // -------------------------------
        System.out.println("=== Registro de Estudiantes ===");
        Estudiante est1 = new Estudiante();
        est1.nombre = "Juan";
        est1.apellido = "Perez";
        est1.curso = "Programacion II";
        est1.calificacion = 7.5;

        est1.mostrarInfo();
        est1.subirCalificacion(1.5);
        est1.bajarCalificacion(0.5);
        est1.mostrarInfo();

        // -------------------------------
        // 2. Registro de Mascotas
        // -------------------------------
        System.out.println("\n=== Registro de Mascotas ===");
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 3;

        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        // -------------------------------
        // 3. Encapsulamiento con Libro
        // -------------------------------
        System.out.println("\n=== Encapsulamiento con Libro ===");
        Libro l1 = new Libro("El Principito", "Antoine de Saint-Exupery", 1943);
        System.out.println("Libro: " + l1.getTitulo() + " - Autor: " + l1.getAutor() + " - Anio: " + l1.getAnioPublicacion());

        // Intento con año invalido
        l1.setAnioPublicacion(1400);
        // Intento con año valido
        l1.setAnioPublicacion(2020);
        System.out.println("Libro actualizado: " + l1.getTitulo() + " - " + l1.getAutor() + " - " + l1.getAnioPublicacion());

        // -------------------------------
        // 4. Gestion de Gallinas
        // -------------------------------
        System.out.println("\n=== Gestion de Gallinas ===");
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        Gallina g2 = new Gallina();
        g2.idGallina = 2;

        g1.envejecer();
        g1.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();

        // -------------------------------
        // 5. Simulacion de Nave Espacial
        // -------------------------------
        System.out.println("\n=== Simulacion de Nave Espacial ===");
        NaveEspacial nave = new NaveEspacial("Apolo", 50);

        nave.mostrarEstado();
        nave.avanzar(10); // intento sin recargar suficiente
        nave.recargarCombustible(30);
        nave.despegar();
        nave.avanzar(15);
        nave.mostrarEstado();
    }
}