package tp5.ej14;

public class EditorVideo {
    // Dependencia de CREACIÓN: el Render se instancia dentro del método
    public Render exportar(String formato, Proyecto proyecto) {
        if (formato == null || formato.isBlank()) {
            throw new IllegalArgumentException("El formato no puede estar vacío");
        }
        Render r = new Render(formato, proyecto); // creación aquí
        System.out.println("Exportando proyecto '" +
            (proyecto != null ? proyecto.getNombre() : "desconocido") +
            "' a formato " + formato + "...");
        // usar r localmente (log, validaciones, etc.)
        return r; // devolver para que el llamador lo use
    }
}
