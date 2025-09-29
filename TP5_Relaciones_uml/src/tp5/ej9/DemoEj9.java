package tp5.ej9;

public class DemoEj9 {
    public static void run() {
        System.out.println("\n-- Ej9: CitaMedica-Paciente-Profesional --");
        Paciente p = new Paciente("Maria Vega", "IOSPER");
        Profesional prof = new Profesional("Dr. Lopez", "Clínica Medica");
        CitaMedica c = new CitaMedica("2025-10-02", "09:30", p, prof);

        System.out.println(c);
    }
}

