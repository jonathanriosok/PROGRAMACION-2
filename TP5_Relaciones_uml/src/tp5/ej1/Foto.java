package tp5.ej1;

public class Foto {
    private String imagen;   // ruta o nombre simbólico
    private String formato;  // jpg, png, etc.

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
    }
}
