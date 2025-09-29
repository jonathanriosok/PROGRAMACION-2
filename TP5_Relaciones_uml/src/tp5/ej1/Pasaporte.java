package tp5.ej1;

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;       // composición (creada adentro)
    private Titular titular; // asociación bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision,
                     Titular titular, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // composición
        setTitular(titular);
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    public void setTitular(Titular t) {
        if (this.titular == t) return;
        this.titular = t;
        if (t != null && t.getPasaporte() != this) {
            t.setPasaporteInternal(this);
        }
    }

    public void cambiarFoto(String nuevaImagen, String nuevoFormato) {
        this.foto = new Foto(nuevaImagen, nuevoFormato);
    }

    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision +
               ", foto=" + foto +
               ", titular=" + (titular != null ? titular.getNombre() : "null") + "}";
    }
}
