package tp5.ej7;

public class Motor {
    private String tipo;        // p.ej. "naftero", "diesel"
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }

    @Override
    public String toString() {
        return "Motor{tipo='" + tipo + "', numeroSerie='" + numeroSerie + "'}";
    }
}
