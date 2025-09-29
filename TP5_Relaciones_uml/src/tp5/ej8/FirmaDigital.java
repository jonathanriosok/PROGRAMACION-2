package tp5.ej8;

import java.time.LocalDateTime;

// Agregación: la firma conoce al Usuario, pero el Usuario existe aparte
public class FirmaDigital {
    private String codigoHash;
    private LocalDateTime fecha;
    private Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() { return codigoHash; }
    public LocalDateTime getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "FirmaDigital{hash='" + codigoHash + "', fecha=" + fecha +
               ", usuario=" + (usuario != null ? usuario.getNombre() : "null") + "}";
    }
}
