package tp5.ej10;

// Composición: CuentaBancaria crea y administra su ClaveSeguridad
// Bidi: CuentaBancaria <-> Titular
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular titular;      // bidi

    public CuentaBancaria(String cbu, double saldoInicial, String claveInicial) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.clave = new ClaveSeguridad(claveInicial); // composición: nace adentro
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }

    public void setTitular(Titular t) {
        if (this.titular == t) return;
        this.titular = t;
        if (t != null && t.getCuenta() != this) t.setCuentaInternal(this);
    }

    // operaciones simples
    public void depositar(double monto) { this.saldo += monto; }
    public boolean extraer(double monto) {
        if (monto <= 0 || monto > saldo) return false;
        saldo -= monto;
        return true;
    }

    // composición: la cuenta decide cómo cambia la clave
    public void cambiarClave(String nuevaClave) { this.clave.cambiar(nuevaClave); }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + clave +
               ", titular=" + (titular != null ? titular.getNombre() : "null") + "}";
    }
}
