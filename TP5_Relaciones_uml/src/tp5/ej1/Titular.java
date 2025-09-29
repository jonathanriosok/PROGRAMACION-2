package tp5.ej1;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Pasaporte getPasaporte() { return pasaporte; }

    // setter interno para evitar recursión infinita
    void setPasaporteInternal(Pasaporte p) { this.pasaporte = p; }

    public void setPasaporte(Pasaporte p) {
        if (this.pasaporte == p) return;
        this.pasaporte = p;
        if (p != null && p.getTitular() != this) {
            p.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
