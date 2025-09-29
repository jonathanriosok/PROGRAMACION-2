package tp5.ej7;

// Agregación: Vehiculo -> Motor
// Bidireccional: Vehiculo <-> Conductor
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;        // agregación
    private Conductor conductor; // bidi

    public Vehiculo(String patente, String marca, String modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor; // llega de afuera
    }

    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }

    public void setMotor(Motor motor) { this.motor = motor; } // se puede cambiar

    public void setConductor(Conductor c) {
        if (this.conductor == c) return;
        this.conductor = c;
        if (c != null && c.getVehiculo() != this) c.setVehiculoInternal(this);
    }

    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', marca='" + marca + "', modelo='" + modelo +
               "', motor=" + motor +
               ", conductor=" + (conductor != null ? conductor.getNombre() : "null") + "}";
    }
}
