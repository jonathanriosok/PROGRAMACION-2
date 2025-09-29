package tp5.ej12;

public class Calculadora {
    // Dependencia de uso: el Impuesto llega por parámetro (no se guarda)
    public double calcular(Impuesto impuesto) {
        if (impuesto == null) return 0.0;
        double monto = impuesto.getMonto();
        // Ejemplo tonto: suma 21% de IVA si corresponde
        double iva = monto * 0.21;
        double total = monto + iva;
        System.out.println("Calculando total para " +
            (impuesto.getContribuyente() != null ? impuesto.getContribuyente().getNombre() : "N/A") +
            ": base=" + monto + ", IVA= " + iva + " -> total=" + total);
        return total;
    }
}
