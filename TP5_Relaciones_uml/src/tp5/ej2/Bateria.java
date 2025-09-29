package tp5.ej2;

public class Bateria {
    private String modelo;
    private int capacidadMah;

    public Bateria(String modelo, int capacidadMah) {
        this.modelo = modelo;
        this.capacidadMah = capacidadMah;
    }

    public String getModelo() { return modelo; }
    public int getCapacidadMah() { return capacidadMah; }

    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidadMah=" + capacidadMah + "}";
    }
}
