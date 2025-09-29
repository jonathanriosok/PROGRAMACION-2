package tp5.ej5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // bidi

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

    // setter interno para evitar recursión
    void setComputadoraInternal(Computadora c) { this.computadora = c; }

    public void setComputadora(Computadora c) {
        if (this.computadora == c) return;
        this.computadora = c;
        if (c != null && c.getPropietario() != this) c.setPropietario(this);
    }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

