package tp5.ej4;

// Bidi: TarjetaDeCredito <-> Cliente
// Agregación: TarjetaDeCredito -> Banco
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // bidireccional
    private Banco banco;     // agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }

    public void setCliente(Cliente c) {
        if (this.cliente == c) return;
        this.cliente = c;
        if (c != null && c.getTarjeta() != this) c.setTarjetaInternal(this);
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + fechaVencimiento +
               "', banco=" + (banco!=null? banco.getNombre() : "null") +
               ", cliente=" + (cliente!=null? cliente.getNombre() : "null") + "}";
    }
}
