package tp5.ej2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }

    // setter interno para sincronizar sin recursión
    void setCelularInternal(Celular c) { this.celular = c; }

    public void setCelular(Celular c) {
        if (this.celular == c) return;
        this.celular = c;
        if (c != null && c.getUsuario() != this) c.setUsuario(this);
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
