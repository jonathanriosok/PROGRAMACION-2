package tp6.colecciones;

public class MainCurso {

    public static void main(String[] args) {

        Profesor prof = new Profesor("Laura Torres", "Programacion II");

        Curso curso = new Curso("Programacion II - Comision A", prof);

        Estudiante e1 = new Estudiante("Ana Lopez", 1001);
        Estudiante e2 = new Estudiante("Carlos Gomez", 1002);
        Estudiante e3 = new Estudiante("Maria Perez", 1003);

        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);
        curso.agregarEstudiante(e3);

        curso.mostrarDatosCurso();
        curso.listarEstudiantes();

        System.out.println("\n=== Buscar legajo 1002 ===");
        System.out.println(curso.buscarEstudiante(1002));

        System.out.println("\n=== Eliminar legajo 1002 ===");
        curso.quitarEstudiante(1002);
        curso.listarEstudiantes();
    }
}
