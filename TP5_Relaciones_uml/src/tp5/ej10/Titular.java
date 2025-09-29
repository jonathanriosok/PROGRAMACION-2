package tp5.ej10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // bidi

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }

    // setter interno para evitar recursión
    void setCuentaInternal(CuentaBancaria c) { this.cuenta = c; }

    public void setCuenta(CuentaBancaria c) {
        if (this.cuenta == c) return;
        this.cuenta = c;
        if (c != null && c.getTitular() != this) c.setTitular(this);
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
