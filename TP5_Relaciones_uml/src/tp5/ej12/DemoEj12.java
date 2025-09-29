package tp5.ej12;

public class DemoEj12 {
    public static void run() {
        System.out.println("\n-- Ej12: Calculadora-Impuesto-Contribuyente (dependencia de uso) --");
        Contribuyente c = new Contribuyente("Pedro Ramirez", "20-30123456-7");
        Impuesto imp = new Impuesto(100000, c);

        Calculadora calc = new Calculadora();
        calc.calcular(imp);     // dependencia de uso: se pasa por parámetro
        calc.calcular(null);    // caso borde
    }
}
