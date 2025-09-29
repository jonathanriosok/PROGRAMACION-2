package tp5.ej4;

public class DemoEj4 {
    public static void run() {
        System.out.println("\n-- Ej4: TarjetaDeCredito-Cliente-Banco --");
        Banco b = new Banco("Banco Nación", "30-99999999-7");
        Cliente c = new Cliente("Maria Lopez", "30111222");
        TarjetaDeCredito t = new TarjetaDeCredito("4509 1234 5678 9010", "12/28", b);

        t.setCliente(c); // vincula bidi
        System.out.println(t);
        System.out.println(c + " -> tarjeta: " + c.getTarjeta().getNumero());
    }
}
