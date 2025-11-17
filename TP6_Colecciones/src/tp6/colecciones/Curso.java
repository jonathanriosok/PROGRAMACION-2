package tp6.colecciones;

import java.util.ArrayList;

public class Curso {

    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void quitarEstudiante(int legajo) {
        estudiantes.removeIf(e -> e.getLegajo() == legajo);
    }

    public Estudiante buscarEstudiante(int legajo) {
        for (Estudiante e : estudiantes) {
            if (e.getLegajo() == legajo) {
                return e;
            }
        }
        return null;
    }

    public void listarEstudiantes() {
        System.out.println("=== Estudiantes del curso " + nombreCurso + " ===");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void mostrarDatosCurso() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Profesor: " + profesor);
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());
    }
}
