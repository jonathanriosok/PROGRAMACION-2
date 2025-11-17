package tp6.colecciones;

public class Profesor {
    private String nombre;
    private String materia;

    public Profesor(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return nombre + " (" + materia + ")";
    }
}
