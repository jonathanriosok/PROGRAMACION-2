package tp5.ej5;

// Composición: Computadora crea y administra su PlacaMadre
// Bidi: Computadora <-> Propietario
public class Computadora {
    private String marca;
    private String modelo;
    private PlacaMadre placaMadre;   // composición (se crea adentro)
    private Propietario propietario; // bidireccional

    public Computadora(String marca, String modelo, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.modelo = modelo;
        // COMPOSICIÓN: la placa nace dentro de la computadora
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    // Si querés "cambiar" la placa, la crea internamente (sigue siendo composición)
    public void reemplazarPlaca(String nuevoModelo, String nuevoChipset) {
        this.placaMadre = new PlacaMadre(nuevoModelo, nuevoChipset);
    }

    public void setPropietario(Propietario p) {
        if (this.propietario == p) return;
        this.propietario = p;
        if (p != null && p.getComputadora() != this) p.setComputadoraInternal(this);
    }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', modelo='" + modelo +
               "', placaMadre=" + placaMadre +
               ", propietario=" + (propietario != null ? propietario.getNombre() : "null") + "}";
    }
}
