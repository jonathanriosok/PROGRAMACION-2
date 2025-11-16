package tp7_hyp;

import java.util.ArrayList;
import java.util.List;

public class MainKata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // upcasting automático a Empleado
        empleados.add(new EmpleadoPlanta("Ana", 300000, 3));
        empleados.add(new EmpleadoTemporal("Luis", 120, 2500));
        empleados.add(new EmpleadoPlanta("Maria", 280000, 1));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre()
                    + " - Sueldo: " + e.calcularSueldo());

            // uso de instanceof + downcasting
            if (e instanceof EmpleadoPlanta) {
                EmpleadoPlanta ep = (EmpleadoPlanta) e; // downcasting
                System.out.println("   Tipo: Planta permanente");
            } else if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal et = (EmpleadoTemporal) e; // downcasting
                System.out.println("   Tipo: Temporal por horas");
            }
        }
    }
}

