package tp5.ej6;

// Unidireccional: Reserva conoce a Cliente (Cliente no guarda Reserva)
// Agregación: la Mesa se pasa desde afuera (puede existir sin la Reserva)
public class Reserva {
    private String fecha;  // para simplificar, String "2025-09-28"
    private String hora;   // "20:30"
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente; // unidireccional
        this.mesa = mesa;       // agregación
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }

    public void cambiarMesa(Mesa nuevaMesa) { this.mesa = nuevaMesa; } // agregación: puede cambiar

    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "', cliente=" +
                (cliente != null ? cliente.getNombre() : "null") +
                ", mesa=" + (mesa != null ? ("#" + mesa.getNumero()) : "null") + "}";
    }
}
