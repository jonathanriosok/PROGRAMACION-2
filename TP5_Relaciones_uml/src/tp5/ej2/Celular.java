package tp5.ej2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación (viene de afuera)
    private Usuario usuario; // asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // agregación
    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }

    public void setBateria(Bateria bateria) { this.bateria = bateria; } // se puede cambiar

    public void setUsuario(Usuario u) {
        if (this.usuario == u) return;
        this.usuario = u;
        if (u != null && u.getCelular() != this) u.setCelularInternal(this);
    }

    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo +
               "', bateria=" + bateria +
               ", usuario=" + (usuario != null ? usuario.getNombre() : "null") + "}";
    }
}

