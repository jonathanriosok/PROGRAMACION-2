package tp7_hyp;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);           // uso de super
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {         // polimorfismo por sobrescritura
        System.out.println("Auto: " + getMarca() + " " + getModelo()
                + " - Puertas: " + cantidadPuertas);
    }
}

