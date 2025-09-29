package tp5.ej10;

import java.time.LocalDateTime;

public class ClaveSeguridad {
    private String codigo;
    private LocalDateTime ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = LocalDateTime.now();
    }

    public String getCodigo() { return codigo; }
    public LocalDateTime getUltimaModificacion() { return ultimaModificacion; }

    public void cambiar(String nuevoCodigo) {
        this.codigo = nuevoCodigo;
        this.ultimaModificacion = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion=" + ultimaModificacion + "}";
    }
}
