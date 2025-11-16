package tp7_hyp;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int aniosAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        double adicionalAntiguedad = aniosAntiguedad * 15000;
        return sueldoBase + adicionalAntiguedad;
    }
}

