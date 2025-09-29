package tp5.ej9;

// Unidireccional: Cita conoce a Paciente y a Profesional; ellos no guardan la Cita
public class CitaMedica {
    private String fecha;      // "2025-10-02"
    private String hora;       // "09:30"
    private Paciente paciente; // uni
    private Profesional profesional; // uni

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora + "', " +
               "paciente=" + (paciente != null ? paciente.getNombre() : "null") + ", " +
               "profesional=" + (profesional != null ? profesional.getNombre() : "null") + "}";
    }
}
