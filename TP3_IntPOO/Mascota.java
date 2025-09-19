package tp3_poo;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println(nombre + " (" + especie + "), Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}