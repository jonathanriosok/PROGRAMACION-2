package tp5.ej12;

// Unidireccional: Impuesto conoce al Contribuyente
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    @Override
    public String toString() {
        return "Impuesto{monto=" + monto + ", contribuyente=" +
               (contribuyente != null ? contribuyente.getNombre() : "null") + "}";
    }
}
