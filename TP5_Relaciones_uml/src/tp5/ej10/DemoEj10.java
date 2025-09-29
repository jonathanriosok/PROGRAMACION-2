package tp5.ej10;

public class DemoEj10 {
    public static void run() {
        System.out.println("\n-- Ej10: CuentaBancaria-ClaveSeguridad-Titular --");
        CuentaBancaria cb = new CuentaBancaria("0170001230000000000001", 100_000, "1234");
        Titular t = new Titular("Laura Gomez", "33123456");
        cb.setTitular(t); // vincula bidi

        System.out.println(cb);

        cb.depositar(25000);
        cb.extraer(15000);
        System.out.println("Saldo tras movimientos: " + cb.getSaldo());

        cb.cambiarClave("9876");
        System.out.println("Nueva clave: " + cb.getClave());
    }
}
