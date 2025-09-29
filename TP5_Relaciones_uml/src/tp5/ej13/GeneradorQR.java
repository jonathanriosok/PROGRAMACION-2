package tp5.ej13;

public class GeneradorQR {
    // Dependencia de creación: crea el CodigoQR DENTRO del método (no como atributo)
    public CodigoQR generar(String valor, Usuario usuario) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El valor del QR no puede ser vacío");
        }
        CodigoQR qr = new CodigoQR(valor, usuario); // <- creación aquí
        System.out.println("QR generado para " +
            (usuario != null ? usuario.getNombre() : "usuario desconocido") +
            ": " + valor);
        return qr; // se puede devolver para usarlo afuera
    }
}
